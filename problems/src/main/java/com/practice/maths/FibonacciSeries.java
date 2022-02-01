package com.practice.maths;

public class FibonacciSeries {

	public static void main(String[] args) {

		int a = 0;
		int b = 1;
		int c = 0;

		while (c < 100) {
			System.out.print(a + ", ");
			c = a + b;
			a = b;
			b = c;
		}

	}

}
