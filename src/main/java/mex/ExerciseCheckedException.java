package mex;

public class ExerciseCheckedException extends Exception {
    private static final long serialVersionUID = 1L;
    private boolean somethingUnexpected = true;

    public ExerciseCheckedException(String message) throws Exception {
        super(message);
        if (somethingUnexpected) {
        	throw new Exception();
        }
    }
}
