package mex.s03;

public class Exercise3 {
    /**
     * Convert the parameter to its English name, if it is in [0..9]
     * 
     * @param value an integer
     * @return "zero" for 0 ... "nine" for 9, or "other"
     */
    public static String asWord(int value) {
        String result; //in caso di return questa è inutile
        switch (value) {
        case 0:
        	result = "zero"; //anche solo: return "zero" senza break
        	break;
        case 1:
        	result = "one";
        	break;
        case 2:
        	result = "two";
        	break;
        case 3:
        	result = "three";
        	break;
        case 4: 
        	result = "four";
        	break;
        case 5:
        	result = "five";
        	break;
        case 6:
        	result = "six";
        	break;
        case 7:
        	result = "seven";
        	break;
        case 8:
        	result = "eight";
        	break;
        case 9:
        	result = "nine";
        default:
        	result = "other";
        	break;        
        }
        return result;
    }
}
