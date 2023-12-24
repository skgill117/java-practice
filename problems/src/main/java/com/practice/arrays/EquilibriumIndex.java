package com.practice.arrays;

public class EquilibriumIndex {

	public static void main(String[] args) {

		int[] arr = { 4, 5, 7, 9, 2, 14 };

		System.out.println("equilibrium index : " + findEquilibriumIdx(arr));

	}

	private static int findEquilibriumIdx(int[] arr) {

		if (arr.length > 0) {

			int leftSum = 0;
			int totalSum = 0;
			for (int i = 0; i < arr.length; i++)
				totalSum += arr[i];

			for (int i = 0; i < arr.length; i++) {
				totalSum -= arr[i];

				if (leftSum == totalSum)
					return i;
				
				leftSum += arr[i];
			}

		}

		return -1;
	}

}
