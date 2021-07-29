package com.practice.maths;

public class FirstNprimeNumbers {

	public static void main(String[] args) {

		int n = 7;
		int count = 1;

		int startPoint = 1;
		while (count <= n) {
			startPoint++;
			boolean isPrime = checkPrimeNumber(startPoint);
			if (isPrime) {
				System.out.print(startPoint + "  ");
				count++;
			}

		}

	}

	private static boolean checkPrimeNumber(int startPoint) {
		boolean isPrime = true;
		for (int i = 2; i <= startPoint / 2; i++) {

			if (startPoint % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}

}
