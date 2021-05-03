package mex.s05;

public class Exercise1 {
	/**
	 * Reverse a string
	 * 
	 * @param s
	 * @return the input reversed
	 */
	public static String reverse(String s) {
		if (s==null) {
			return null; //meglio aggiungere check all'inizio
		}
		StringBuilder result = new StringBuilder();
		for (int i = s.length()-1; i >= 0; i--) { //for al contrario!
			char c = s.charAt(i);				  // se volessimo lasciare il for normale:
			result.append(c);                     // char c = s.charAt(s.length()-1-i);
		}
		return result.toString();
	}
}
