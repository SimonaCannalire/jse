package m02.s10.ex;

import java.util.Arrays; //swap the arrays true-false.

public class Exercise2 {
	public static void main(String[] args) {
		boolean[] flags = { true, false, false };
		System.out.println(Arrays.toString(flags));
		for (int i = 0; i < flags.length; i++) {
			if (flags[i] == true) {
				flags[i] = false;
			} else {
				flags[i] = true;
			}
		}
		System.out.println(Arrays.toString(flags));
	}
}
