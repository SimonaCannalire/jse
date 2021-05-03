package mex.s06;

public class Exercise3 {
	/**
	 * Find the largest value
	 * 
	 * @param data
	 * @return the largest value
	 */
	public static int max(int[] data) {

		if (data == null || data.length == 0) {
			return Integer.MIN_VALUE;
		} // ideale sarebbe tirare eccezione
		int result = data[0];

		for (int i = 0; i < data.length; i++) {
			if (data[i] > result) {
				result = data[i]; // result è una var temp
			} //continua a loopare finché non trova max
		}
		return result;
	}
}
