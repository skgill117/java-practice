package com.practice.maths;

public class Factorial {

	public static void main(String[] args) {
		
		System.out.println(factorial(5));

	}

	private static int factorial(int num) {
		int factorial = 1;
		for(int i = num; i > 0; i--) {
			
			factorial = factorial * i;
		}
		return factorial;
	}

}
