package com.practice.strings;

public class LongestPalindrome {

	public static void main(String[] args) {

		String s = "shecejdunmadamkfkf";
		//String s = "shhklrt";
		//String s = "t";

		int n = s.length();
		if(n < 2) {
			
			System.out.println(s);
			
		}else {
			int maxSize = 0;
			String palindrome = "";
			for (int i = 0; i < n; i++) {
				
				for(int j = i+1; j <= n; j++) {
					String subString = s.substring(i, j);
						
					int palindromeSize = calculatePalindromeSize(subString);
					if (palindromeSize > maxSize) {
						maxSize = palindromeSize;
						palindrome = subString;
						
					}
				}

				

			}

			System.out.println(palindrome);
		}

		

	}

	private static int calculatePalindromeSize(String subString) {
		boolean isPalindrome = false;
			StringBuffer sb = new StringBuffer(subString);
			if (subString.equals(sb.reverse().toString())) {
				isPalindrome = true;
			}
		return (isPalindrome == true ? subString.length() : 0);
	}

}
