package com.practice.maths;

public class Exponential {

	public static void main(String[] args) {

		double x = 1.01;
		int n = 365;
		double pow = power(x, n);
		System.out.println(pow);
		System.out.println(Math.pow(x, n));

	}

	private static double power(double x, int n) {
		double result = 1;
		for (int i = 1; i <= n/2; i++) {
			result = result * x;

		}
		return result * result;
	}

	

}
