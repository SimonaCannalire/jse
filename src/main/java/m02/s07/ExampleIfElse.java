package m02.s07;

public class ExampleIfElse {
	public static void main(String[] args) {
		if (args.length == 1) {
			System.out.println("You passed me: " + args [0]);
		} else if (args.length == 2 ) {
			System.out.println("You passed me two strings, the second one is:" + args [1]);
		} else if (args.length > 2) {
			System.out.println("You passed me a lot of strings, the last one is: " + args[args.length - 1]);
		}
		
		System.out.println("bye");
	}

}
