package fc.id.au;

import org.neuroph.core.NeuralNetwork;


public class YSubClade {	
	
	public static String predict(int[] dys,String HG) {
		int[] TUNING=YSubCladeUtil.getTuning(HG);
		int[] BITS=YSubCladeUtil.getBits(HG);
		String[] OUTPUT=YSubCladeUtil.getOutput(HG);
		int total_bits=0;
		for(int i=0;i<BITS.length;i++)
			total_bits+=BITS[i];
		
		String[] binary_str=new String[12];
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<12;i++)
		{
			binary_str[i]="00000"+Integer.toBinaryString(dys[i]-TUNING[i]);
			binary_str[i]=binary_str[i].substring(binary_str[i].length()-BITS[i]);
			sb.append(binary_str[i]);
		}
		String input=sb.toString();
		double[] input_normalized=new double[total_bits];
		
		for(int i=0;i<total_bits;i++)
		{
			if(input.charAt(i)=='0')
				input_normalized[i]=0;
			else if(input.charAt(i)=='1')
				input_normalized[i]=1;
			else
				throw new RuntimeException("Error:Input data not normalized.");
		}
		
		NeuralNetwork neuralNetwork = NeuralNetwork.load(YHaploEntryDlg.class.getResourceAsStream("/fc/id/au/haplogroups/"+HG+".nnet"));
		neuralNetwork.setInput(input_normalized);
		neuralNetwork.calculate(); 
		double[] networkOutput = neuralNetwork.getOutput();
		
		sb.setLength(0);
		for(int i=0;i<networkOutput.length;i++)
		{
			sb.append((Math.round(networkOutput[i])));
		}
		String output=sb.toString();	
		int value=Integer.parseInt(output, 2);
		String haplogroup=OUTPUT[value];
		return haplogroup;		
	}

}
