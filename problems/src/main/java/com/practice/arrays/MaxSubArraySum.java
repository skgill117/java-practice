package com.practice.arrays;

//Kadane's Algorithm

public class MaxSubArraySum {

	public static void main(String[] args) {
		int[] arr = { 4, 7, 2, 5, -1, -2, 7, 9, 4, -5 };
		long sum = maxSubArraySum(arr);
		System.out.println(sum);

	}

	private static long maxSubArraySum(int arr[]) {

		long maxSum = arr[0];
		long currSum = arr[0];

		for (int i = 1; i < arr.length; i++) {

			if (currSum >= 0) {
				currSum += arr[i];
			} else {
				currSum = arr[i];
			}

			if (maxSum < currSum)
				maxSum = currSum;

		}

		return maxSum;

	}

}
