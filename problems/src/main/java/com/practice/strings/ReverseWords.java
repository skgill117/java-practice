package com.practice.strings;

public class ReverseWords {

	public static void main(String[] args) {
		
		String s = "How are you";
		
		String [] arr = s.split(" ");
		
		
		StringBuffer sb = new StringBuffer();
		
		for(int i = 0; i < arr.length; i++) {
			
			 String s1 = arr[i];
			 
			 sb.append(reverseString(s1));
			 sb.append(" ");
			 
			 
		}
		
		System.out.println("reverse---   "+sb.toString());

	}

	private static String reverseString(String s1) {
		StringBuffer sb = new StringBuffer();
		
		char [] arr = s1.toCharArray();
		for(int i = (arr.length-1); i >= 0; i--) {
			
			sb.append(arr[i]);
		}
		
		return sb.toString();
	}

}
