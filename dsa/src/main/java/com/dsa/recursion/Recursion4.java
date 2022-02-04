package com.dsa.recursion;

//calaculate factorial of a number
//try this program with debugger
public class Recursion4 {

	public static void main(String[] args) {

		int n = factorial(5);
		int s = simpleFactorial(5);

		System.out.println(n);
		System.out.println(s);

	}

	private static int factorial(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}

	private static int simpleFactorial(int n) {
		if (n == 1) {
			return 1;
		} else {
			int i = simpleFactorial(n - 1);
			int fact = n * i;
			return fact;

		}
	}

}
