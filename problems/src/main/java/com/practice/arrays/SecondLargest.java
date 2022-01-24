package com.practice.arrays;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {

		int[] arr = { 7, 54, 87, 25, 37, 87, 45, 66 };
		System.out.println(findSecondLargest(arr));

	}

	private static int findSecondLargest(int[] arr) {
		Arrays.sort(arr);

		for (int i = arr.length - 1; i > 0; i--) {
			if (arr[i] > arr[i - 1]) {
				return arr[i - 1];
			}
		}
		return -1;

	}

}
