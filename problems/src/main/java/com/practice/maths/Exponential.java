package com.practice.maths;

public class Exponential {

	public static void main(String[] args) {

		double d = 1.01;
		int exp = 365;
		double result = 1;
		for (int i = 1; i <= 365; i++) {
			result = result * d;

		}
		System.out.println(result);
		System.out.println(Math.pow(d, exp));
	}

}
