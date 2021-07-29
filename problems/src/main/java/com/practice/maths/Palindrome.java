/**
 * 
 */
package com.practice.maths;

/**
 * @author shivk Given an integer x, return true if x is palindrome integer.
 * 
 *         An integer is a palindrome when it reads the same backward as
 *         forward. For example, 121 is palindrome while 123 is not.
 * 
 * 
 * 
 *         Example 1:
 * 
 *         Input: x = 121 Output: true Example 2:
 * 
 *         Input: x = -121 Output: false Explanation: From left to right, it
 *         reads -121. From right to left, it becomes 121-. Therefore it is not
 *         a palindrome.
 * 
 *         Follow up: Could you solve it without converting the integer to a
 *         string?
 *
 */
public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome(121));
	}

	public static boolean isPalindrome(int x) {
		int temp = x;
		int rev = 0;
		while (temp != 0) {

			int rem = temp % 10;
			temp = temp / 10;
			rev = rev * 10 + rem;

		}

		if (x == rev)
			return true;
		else
			return false;

	}

}
