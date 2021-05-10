package mex.s06;

public class Exercise1a {
    /**
     * Reverse an array of integers
     * 
     * @param data
     * @return a new array holding the same elements of input, in reversed order
     */
    public static int[] reverse(int[] data) {
        if (data == null) {
        	return null;
        }
    	int[] result = new int[data.length];
    	for (int i = 0; i < data.length; i++) {
    		result[i] = data[data.length - i -1];   		
    	} //vado dall'ultimo elemento verso il primo      
        return result;
    }
}
