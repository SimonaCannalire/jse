package mex.s06;

public class Exercise2a {
	/**
	 * Calculate the average
	 * 
	 * @param data
	 * @return the average
	 */
	public static double average(int[] data) {
		double result = 0.0;
		
		for (int i = 0; i < data.length; i++) {
			result += data[i]; // somma i+j+k+...
		}
		return result / data.length; // divisione
	}
}
