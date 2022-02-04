package com.dsa.recursion;

//find power of any number
public class Recursion5 {

	public static void main(String[] args) {

		System.out.println(pow(2, 5));

	}

	private static int pow(int x, int n) {

		if (n == 0) {
			return 1;
		}

		int xpn2 = pow(x, n / 2);
		int xpn = xpn2 * xpn2;
		if (n % 2 != 0) {
			xpn = xpn * x;
		}

		return xpn;

	}

}
