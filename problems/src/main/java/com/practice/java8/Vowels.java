package com.practice.java8;

public class Vowels {

	public static void main(String[] args) {
		
		String vowels = "aeiou";
		 String str = "Hi WElcome to Java";
		 str.chars().filter(x -> vowels.contains(Character.toString(x).toLowerCase())).forEach(v -> System.out.println(Character.toChars(v)));
		 
	    
	      
	}

}
