package m02.s10.ex;

public class Exercise3 {
	public static void main(String[] args) {
		/*
		 * TODO: Print (1) the number of arguments passed to this main
		 */
		System.out.println("You passed me " + args.length + " argument(s)");

		// 2a - con un FOR
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}

		System.out.println("---");

		// 2b - con un FOR EACH
		for (String current : args) {
			System.out.println(current);
		}

		System.out.println("---");

		// 2c - con un WHILE
		int i = 0;
		while (i < args.length) {
			System.out.println(args[i]);
			i++; // fondamentale per non entrare in loop
		}

		System.out.println("---");

		// 2d - con un DO WHILE
		int j = 0;//i=0; la i è stata inizializzata già prima
		if (args.length != 0) {
		System.out.println("No do while here!");
		} else {
		do {
			System.out.println(args[j]);
			j++;
		} while (j < args.length);
		
		System.out.println("done!");
	}   // il do while è problematico quindi se abbiamo
	    // 0 elementi dobbiamo specificarlo sennò entra
	    // in un loop infinito (in questo caso).
  }
}
