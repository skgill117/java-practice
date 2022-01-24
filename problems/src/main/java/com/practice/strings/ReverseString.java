package com.practice.strings;

public class ReverseString {

	public static void main(String[] args) {
		
		String s = "Hello World";
		
		char [] arr = s.toCharArray();
		
		int left;
		int right = arr.length - 1;
		for(left = 0; left < right; left++, right--) {
			
			char temp = arr[right];
			arr[right] = arr[left];
			arr[left] = temp;
			
		}
		
		for(char c : arr) {
			System.out.print(c);
		}

	}

}
