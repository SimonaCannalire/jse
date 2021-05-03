package mex.s03;

public class Exercise2 {
    /**
     * Check if the parameter is odd
     * 
     * @param value an integer
     * @return true if odd
     */
    public static boolean isOdd(int value) {
       if (value % 2 == 0) { //se diviso x 2 no resto = even
        	return false;
        } else {
        	return true; //ANCHE SOLO return value % 2 != 0;       	
        }
    }
}
