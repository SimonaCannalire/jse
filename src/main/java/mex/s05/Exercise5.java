package mex.s05;

import java.util.Arrays;

public class Exercise5 {
	/**
	 * Check for anagram
	 * 
	 * @param s
	 * @param t
	 * @return true if s is an anagram of t
	 */
	public static boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
//		char[] a = new char[s.length()];
//		for (int i = 0; i < s.length(); i++) {
//			a[i] = s.charAt(i);
//		}
//		char[] b = new char[t.length()];
//		for (int j = 0; j < t.length(); j++) {
//			b[j] = t.charAt(j);
//		}
		char[] a = s.toCharArray();
		char[] b = t.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
//		if (Arrays.equals(a, b)) {
//			return true;
//		} else {
//			return false;
//		}
		return Arrays.equals(a, b);
	}
}
