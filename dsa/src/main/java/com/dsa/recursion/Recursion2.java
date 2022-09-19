package com.dsa.recursion;

//print counting increasing order.
public class Recursion2 {

	public static void main(String[] args) {

		printIncreasing(10);

	}

	private static void printIncreasing(int n) {

		if (n == 0) {
			return;
		} else {
			printIncreasing(n - 1);
			System.out.println(n);
		}

	}

}
// line number 18 will execute after all recursion call finished and methods are removed from stack memory.
