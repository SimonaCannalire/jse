package m02.s10.ex;

public class Exercise4 {
	public static void main(String[] args) {
		// TODO: print up to three args.
		System.out.println("I can only print 3 out of " + args.length);
		int end = 3;
		if (args.length < 3) {
			end = args.length;
		for (int i = 0; i < end; i++) 
		System.out.println(args[i]);    
		}
	}
}