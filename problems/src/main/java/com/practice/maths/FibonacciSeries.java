package com.practice.maths;

public class FibonacciSeries {

	public static void main(String[] args) {

		int a = 0;
		int b = 1;
		int c = 0;

		System.out.print(a + ", " + b + ", ");

		while (c < 100) {

			c = a + b;

			System.out.print(c + ", ");
			a = b;
			b = c;
		}

	}

}
