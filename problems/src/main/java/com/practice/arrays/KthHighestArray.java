package com.practice.arrays;

import java.util.Arrays;

public class KthHighestArray {

	public static void main(String[] args) {

		int[] arr = { 56, 34, 23, 19, 45, 303, 87, 303, 43, 55, 67, 89, 654, 710, 24, 19, 45 };
		System.out.println(Arrays.toString(arr));
		int k = 3;
		int val = findKthHighest(arr, k);

		System.out.println(val);

		System.out.println(Arrays.toString(arr));

	}

	private static int findKthHighest(int[] arr, int k) {

		for (int i = 0; i <= k; i++) {

			for (int j = 1; j < (arr.length - i); j++) {

				if (arr[j - 1] > arr[j]) {

					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;

				}

			}

		}
		return arr[arr.length - k];
	}

}
