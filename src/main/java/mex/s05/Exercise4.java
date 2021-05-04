package mex.s05;

public class Exercise4 {
    /**
     * Remove the character in the string passed position
     * 
     * @param s
     * @param pos
     * @return a string, same of input but without the character in the specified position
     */
    public static String removeChar(String s, int pos) {
        StringBuilder result = new StringBuilder(s);
        result.deleteCharAt(pos);
        return result.toString();
    }
}
