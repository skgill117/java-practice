package com.practice.recursion;

public class Fibonacci {

	public static int fib(int n) {
		if (n <= 1)
			return n;
		else
			return fib(n - 1) + fib(n - 2);
	}

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.println(fib(i));
		}

	}

}

/* How it works?

 fib(n) = fib(n - 1) + fib(n - 2);

 fib(5) = fib(4) + fib(3);
 fib(4) = fib(3) + fib(2);
 fib(3) = fib(2) + fib(1);
 fib(2) = fib(1) + fib(0);
 fib(1) = 1
 fib(0) = 1
 
*/