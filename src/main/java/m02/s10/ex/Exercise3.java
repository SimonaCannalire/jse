package m02.s10.ex;

public class Exercise3 {
    public static void main(String[] args) {
        /*
         * TODO: Print 
         * (1) the number of arguments passed to this main
         * (2) each argument
         */
    	System.out.println("You passed me " + args.length + " argument(s)");
    	
    	for (int i=0; i<args.length; i++) {
    		System.out.println(args[i]);
    	}
    }
    
}
