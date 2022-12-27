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
		int num = 2147447222;
		// int x = 1534238412;
		System.out.println(num);
		System.out.println(reverse(num));
		System.out.println(reverse2(num));

	}

	/**
	 * @param x
	 * @return
	 */
	public static int reverse(int num) {

		int reverse = 0;
		int rem = 0;
		while (num != 0) {

			rem = num % 10;
			reverse = reverse * 10 + rem;
			num = num / 10;
		}
		return reverse;

	}

	public static int reverse2(int num) {
		int rev = 0;
		while (num != 0) {
			int rem = num % 10;
			num = num / 10;
			if (rev + rem > Integer.MAX_VALUE / 10)
				return 0;
			if (rev + rem < Integer.MIN_VALUE / 10)
				return 0;
			rev = rev * 10 + rem;
		}
		return rev;

	}

}
