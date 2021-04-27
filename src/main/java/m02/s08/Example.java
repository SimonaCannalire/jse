package m02.s08;

public class Example {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Please send me a string!");
		} else {
			switch(args[0] ) {
			case "ciao":
				System.out.println("Hello to you!");
				break; 
			default:
				System.out.println("I don't understand");
			}
			
			if (args[0].equals("ciao")) {
				System.out.println("Hello ciccia!");
			} else if (args[0].equals("Tom")) {
				System.out.println("Welcome back Tom");
			} else {
				System.out.println("I dont understand");
			}
		}
		System.out.println("Bye bye");

	}
}