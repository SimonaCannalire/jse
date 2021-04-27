package m01.s08;

import java.util.Arrays;

public class StringArrayExample {
	public static void main(String[] args) {
		Dog[] dogs = { new Dog(), new Dog() };

		System.out.println(dogs);
		System.out.println(Arrays.toString(dogs));
		System.out.println(Arrays.deepToString(dogs));
	}
}

class Dog {
	@Override
	public String toString() {
		return "A dog";

	}
}