package m09.s15;

import java.util.ArrayList;
import java.util.List;

import javax.xml.crypto.Data;

public class Exercise {
	/**
	 * Extract from input the even values and return them in an array
	 * 
	 * Do not use Collections in here!
	 * 
	 * @param data a bunch of integers
	 * @return even values from input
	 * 
	 *         example: in {2, 3, 4, 5} -> out {2, 4}
	 */
	public int[] evensRaw(int[] data) {
		// throw new UnsupportedOperationException("Not yet implemented");
		int len = 0;
		for (int value : data) {
			if (value % 2 == 0) {
				len += 1;
			}
		}
		int[] result = new int[len];
		int j = 0;
		for (int i = 0; i < data.length; i++) {
			if (data[i] % 2 == 0) {
				result[j] = data[i];
				j += 1;
			}
		}
		return result;
	}
	// questo algoritmo funziona ma è decisamente più
	// macchinoso e dispendioso di result.add(value);
	// potrei anche fare: Arrays.copyOf(result, len);
	// copia result in un nuovo array e dagli dim len:
//		int[] result = new int[data.length];    
//		int len = 0;
//		for (int value : data) {
//			if (value % 2 == 0) {
//				result[len] = value;
//				len += 1;
//			}
//		}
	/**
	 * Extract from input the even values and return them in a List
	 * 
	 * @param data a bunch of integers
	 * @return even values from input
	 * 
	 *         example: in {2, 3, 4, 5} -> out {2, 4}
	 */
	public List<Integer> evens(int[] data) {
		List<Integer> result = new ArrayList<>();
		//tipo di ritorno: Lista di Integer
		for (int value : data) {
			if (value % 2 == 0) {
				result.add(value);
			}
		}
		// value: elemento corrente
		return result;
	}
	// questo è molto più bello! veloce!!
	// utile sopratutto su grandi dimensioni.

	/**
	 * Extract non-duplicated values in input and return them in a list
	 * 
	 * @param data a bunch of integers
	 * @return only the non-duplicated values from input
	 * 
	 *         example: in {2, 3, 4, 4, 5, 5, 6, 7} -> out {2, 3, 6, 7}
	 */
	public List<Integer> singles(int[] data) {
		throw new UnsupportedOperationException("Not yet implemented");
	}

	/**
	 * As above, but with a linear time algorithm
	 * 
	 * @param data
	 * @return
	 */
	public List<Integer> singlesLinear(int[] data) {
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public static void main(String[] args) {
		Exercise ex = new Exercise();
		System.out.println(ex.singlesLinear(new int[] { 2, 3, 4, 4, 5, 6 }));
	}
}
