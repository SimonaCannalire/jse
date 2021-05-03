package mex.s05;

public class Exercise3 {
	/**
     * Remove vowels from the parameter
     * 
     * @param s
     * @return a string, same of input but without vowels
     */
    public static String removeVowels(String s) {
        StringBuilder result = new StringBuilder();
    	for (int i = 0; i < s.length(); i++) {
    		char c = s.charAt(i);
    		if (c != 'a' && c!= 'e' && c!= 'i' && c != 'o' && c!= 'u') {
    			result.append(c);
    		}
    	}
        return result.toString();
    }
}
