package mex.s06;

import java.util.Arrays;

public class Exercise5 {
	/**
	 * Find the duplicated values
	 * 
	 * @param data
	 * @return the duplicated value
	 */
	public static int[] duplicates(int[] data) {
		if (data == null || data.length == 0) {
			return data;
		}
		int size = 0;
		int[] result = new int[data.length];
		Arrays.sort(data);
		for (int i = 1; i < data.length; i++) {
			if (data[i] == data[i - 1]) {
				result[size] = data[i];
				size += 1;
			} // anche: result[size++] = data[i];
		}
		return Arrays.copyOf(result, size);
	}
}
