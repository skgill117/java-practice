package com.practice.strings;

public class ReverseString {

	public static void main(String[] args) {
		
		String s = "Hello World";
		
		char [] arr = s.toCharArray();
		
		int left = 0;
		int right = arr.length - 1;
		
		while(left < right) {
			
			char temp = arr[right];
			arr[right] = arr[left];
			arr[left] = temp;
			
			left++;
			right--;
			
		}
		
		
		for(char c : arr) {
			System.out.print(c);
		}

	}

}
