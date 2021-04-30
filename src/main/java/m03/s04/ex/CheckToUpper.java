package m03.s04.ex;

/**
 * Sort of simple tester, see JUnit for the real stuff
 */
public class CheckToUpper {
    private static void check(String actual, String expected) {
        if (actual.equals(expected)) {
        	System.out.println("ok!");
    } else {
    	System.out.println(String.format("Failure: %s not equals to %s", actual, expected));
    }
    }
    public static void main(String[] args) {
        testBob();
    }

    public static void testBob() {
        Exercise ex = new Exercise();

        String input = "bob";
        String actual = ex.toUpper(input);
        String expected = "BOB";

        check(actual, expected);
    }
}
