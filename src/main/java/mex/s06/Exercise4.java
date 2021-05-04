package mex.s06;

public class Exercise4 {
	/**
	 * Find a non duplicated value
	 *SIMILE A UN ALGORITMO DI SORTING CON ON^2
	 * @param data
	 * @return a non duplicated value
	 */ // algoritmo quadratico, servono due loop
	public static int single(int[] data) {
		if (data == null) {
			return Integer.MIN_VALUE;
		}
		for (int i = 0; i < data.length; i++) {
			boolean found = true; // duplicato
			for (int j = 0; j < data.length; j++) {
				if (i == j) { // confronto elemento corrente con sé stesso
					continue; // vai alla prossima iterazione
				} else if (data[i] == data[j]) { // confronto valore in i con valore in j
					found = false; //valore singolo
					break;
				}
			}
			if (found == true) {
				return data[i];
			}
		}
		return Integer.MIN_VALUE; // servirebbe un'eccezione - PATCH
	}
}
