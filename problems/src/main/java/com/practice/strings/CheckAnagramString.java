package com.practice.strings;

import java.util.Arrays;

public class CheckAnagramString {

	public static void main(String[] args) {
		
		String s1 = "abcd";
		String s2 = "bcda";
		
		System.out.println(checkAnagrams(s1, s2));

	}

	private static boolean checkAnagrams(String s1, String s2) {
		
		if(s1.length() != s2.length()) {
			return false;
		}
		
		char[] arr1 = s1.toCharArray();
		char[] arr2 = s2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		for(int i = 0; i < arr1.length; i++) {
			
			if(arr1[i] != arr2[i])
				return false;
		}
		
		return true;
	}

}
