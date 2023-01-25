/**
 * 
 */
package com.dsa.sorting;

import java.util.Arrays;

/**
 * @author shivk complexity - o(n2)
 *
 */
public class BubbleSort {

	private static int comparisons;

	private static int swaps;

	public static void main(String[] args) {
		int[] arr = { 67, 34, 88, 99, 33, 66, 21, 9, 4, 38, 56, 99 };
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println();
		System.out.println("comparisons : " + comparisons + "------swaps : " + swaps);

	}

	/*
	 * Ignore last element because in every complete iteration the largest number on
	 * right.
	 */
	private static void bubbleSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {

			for (int j = 1; j < n - i; j++) {

				if (arr[j - 1] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
					swaps++;
				}

				comparisons++;

			}
		}

	}

}
