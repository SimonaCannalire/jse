package m02.s10.ex;

public class Exercise1 {
	public static void main(String[] args) {
		// TODO: print all values in [0 .. 9]
		// (1) for loop
		// (2) while loop
		// (3) do-while loop
		System.out.println("I have these values: ");

		// 1: FOR LOOP
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}

		System.out.println("---");

		// 2: WHILE LOOP
		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i++;
		}

		System.out.println("---");
		// 3: DO WHILE LOOP
		int j = 0;
		do {
			System.out.println(j);
			j++;
		} while (j < 10);

		System.out.println("THE END");
	}
}
