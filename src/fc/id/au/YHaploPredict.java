package fc.id.au;

import javax.swing.JOptionPane;

import org.neuroph.core.NeuralNetwork;

public class YHaploPredict {

	static int[] TUNING={6,17,8,6,7,9,9,8,5,8,6,12};
	static int[] BITS={4,4,4,4,4,4,3,4,4,4,4,5};	
	
	public static String predictHaplogroup(int[] dys) {
		try
		{
		//int[] dys={13, 21, 15, 10, 13, 17, 11, 13, 12, 14, 11, 30};//felix
		//int[] dys={13,22,15,10,12,17,11,13,12,12,11,29}; //E
		/*
		System.out.print("12 Marker STR Values:\t");
		for(int i=0;i<dys.length;i++)
		{
			System.out.print(dys[i]+" ");
		}
		System.out.println();
		*/
		String[] binary_str=new String[12];
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<12;i++)
		{
			binary_str[i]="00000"+Integer.toBinaryString(dys[i]-TUNING[i]);
			binary_str[i]=binary_str[i].substring(binary_str[i].length()-BITS[i]);
			sb.append(binary_str[i]);
		}
		String input=sb.toString();
		//System.out.println("Normalized Input:\t"+input);
		
		double[] input_normalized=new double[48];
		
		for(int i=0;i<48;i++)
		{
			if(input.charAt(i)=='0')
				input_normalized[i]=0;
			else if(input.charAt(i)=='1')
				input_normalized[i]=1;
			else
				throw new RuntimeException("Error:Input data not normalized.");
		}
		
		NeuralNetwork neuralNetwork = NeuralNetwork.load(YHaploEntryDlg.class.getResourceAsStream("/fc/id/au/HapNN72.nnet"));
		neuralNetwork.setInput(input_normalized);
		neuralNetwork.calculate(); 
		double[] networkOutput = neuralNetwork.getOutput();
		
		sb.setLength(0);
		for(int i=0;i<networkOutput.length;i++)
		{
			sb.append((Math.round(networkOutput[i])));
		}
		String output=sb.toString();
		//System.out.println("Normalized Output:\t"+output);
		
		int value=Integer.parseInt(output, 2)+65;
		String haplogroup=((char)value)+"";
		//System.out.println("Predicted Haplogroup:\t"+haplogroup);
		return haplogroup;
		}
		catch (Exception e)
		{
			JOptionPane.showMessageDialog(null, "Error:"+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
			return "?";			
		}
	}

}
