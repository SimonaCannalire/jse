package mex;

public class ExerciseUncheckedException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    private boolean somethingUnexpected = true;

    public ExerciseUncheckedException(String message) {
        super(message);
        if (somethingUnexpected) {
        	throw new IllegalStateException();
        }
    }
}
