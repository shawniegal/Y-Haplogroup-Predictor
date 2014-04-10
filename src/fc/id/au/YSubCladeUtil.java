package fc.id.au;

public class YSubCladeUtil {

	public static int[] getTuning(String HG) {
		int[] TUNING = null;
		switch (HG) {
		case "B":
			TUNING = new int[]{12,20,14,8,9,11,10,10,10,12,10,27};
			break;

		default:
			break;
		}
		return TUNING;
	}
	////////
	public static int[] getBits(String HG) {
		int[] BITS = null;
		switch (HG) {
		case "B":
			BITS = new int[]{2,3,3,3,3,3,1,3,3,3,3,3};
			break;

		default:
			break;
		}
		return BITS;
	}
	///////
	public static String[] getOutput(String HG) {
		String[] OUTPUT = null;
		switch (HG) {
		case "B":
			OUTPUT = new String[]{"B","B2a1","B2a1a","B2b4"};
			break;

		default:
			break;
		}
		return OUTPUT;
	}
}
