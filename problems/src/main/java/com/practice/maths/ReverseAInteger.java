package com.practice.maths;

/**
 * @author shivk Given a signed 32-bit integer x, return x with its digits
 *         reversed. If reversing x causes the value to go outside the signed
 *         32-bit integer range [-231, 231 - 1], then return 0.
 * 
 *         Assume the environment does not allow you to store 64-bit integers
 *         (signed or unsigned).
 * 
 * 
 * 
 *         Example 1:
 * 
 *         Input: x = 123 Output: 321 Example 2:
 * 
 *         Input: x = -123 Output: -321
 *
 */
public class ReverseAInteger {

	public static void main(String[] args) {

		// int x = 1534236469;
		// int x = 1534236412;
		int x = 2147447222;
		// int x = 1534238412;
		System.out.println(x);
		System.out.println(reverse(x));
		System.out.println(reverse2(x));

	}

	/**
	 * @param x
	 * @return
	 */
	public static int reverse(int x) {

		int reverse = 0;
		int rem = 0;
		while (x != 0) {

			rem = x % 10;
			reverse = reverse * 10 + rem;
			x = x / 10;
		}
		return reverse;

	}

	public static int reverse2(int x) {
		int rev = 0;
		while (x != 0) {
			int rem = x % 10;
			x = x / 10;
			if (rev + rem > Integer.MAX_VALUE / 10)
				return 0;
			if (rev + rem < Integer.MIN_VALUE / 10)
				return 0;
			rev = rev * 10 + rem;
		}
		return rev;

	}

}
