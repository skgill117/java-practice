package com.practice.strings;

import java.util.Arrays;

public class CheckAnagramString {

	public static void main(String[] args) {

		String s1 = "abcd";
		String s2 = "bcda";

		System.out.println(checkAnagrams(s1, s2));

	}

	private static boolean checkAnagrams(String s1, String s2) {

		if (s1.length() != s2.length()) {
			return false;
		}

		char[] arr1 = s1.toCharArray();
		char[] arr2 = s2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		String s4 = new String(arr1);
		String s5 = new String(arr2);
		if (!s4.equals(s5))
			return false;

		else
			return true;
	}

}
