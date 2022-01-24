/**
 * 
 */
package com.practice.recursion;

/**
 * @author shivk
 *
 */
public class Counting {

	public static void main(String[] args) {

		int counting = 10;

		int lastNumber = printCountingWithOutLoop(counting);
		System.out.println("last ruturn is : " + lastNumber);

	}

	private static int printCountingWithOutLoop(int n) {

		if (n == 1) {

			return 1;
		} else {

			System.out.println(n);

			int recursiveReturns = printCountingWithOutLoop(n - 1);

			System.out.println(recursiveReturns);

			return n - 1;

		}

	}

}
