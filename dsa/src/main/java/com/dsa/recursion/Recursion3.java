/**
 * 
 */
package com.dsa.recursion;

/**
 * @author shivk
 * print decreasing increasing counting
 * to understand recursive calls
 *
 */
public class Recursion3 {

	public static void main(String[] args) {

		int counting = 10;

		int lastNumber = printDecreasingIncreasing(counting);
		System.out.println(lastNumber);

	}

	private static int printDecreasingIncreasing(int n) {

		if (n == 0) {

			return 0;
		} else {

			System.out.println(n);

			int recursiveReturns = printDecreasingIncreasing(n - 1);

			System.out.println(recursiveReturns);

			return n;

		}

	}

}
