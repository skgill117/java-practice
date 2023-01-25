package com.practice.strings;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {

		String s = "GeeksForGeeks";

		System.out.println(findFirstNonRepeatingChar(s));

	}

	private static char findFirstNonRepeatingChar(String s) {
		char c = ' ';
		char[] arr = s.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (s.indexOf(arr[i]) == s.lastIndexOf(arr[i])) {
				c = arr[i];
				break;
			}
		}

		return c;
	}

}
