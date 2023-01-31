package com.practice.maths;

public class Exponential {

	public static void main(String[] args) {

		int x = 2;
		int n = 12;
		System.out.println(power(x, n));
		System.out.println(findPower(x, n));
		System.out.println(Math.pow(x, n));

	}

	private static int power(int x, int n) {
		int result = 1;
		for (int i = 1; i <= n / 2; i++) {
			result = result * x;

		}
		return result * result;
	}

	// most efficient solution in O(logn)
	private static int findPower(int x, int y) {
		
		if (y == 0)
			return 1;

		int temp = findPower(x, y / 2);

		if (y % 2 == 0) {
			return temp * temp;
		} else {
			return x * temp * temp;
		}

	}

}
