package mex.s06;

public class Exercise3b {
	/**
	 * Find the smallest value
	 * 
	 * @param data
	 * @return the smallest value
	 */
	public static int min(int[] data) {
		if (data == null || data.length == 0) {
			throw new IllegalArgumentException("Bad data input");
		} // così ^ si tira un'eccezione
		int result = data[0];
		for (int i = 1; i < data.length; i++) {
			if (data[i] < result) {
				data[i] = result;
			} //mettendo int i = 1 evito che nel primo loop
		}// faccio un test inutile confrontando i con sé stesso
		return result;
	}
}
