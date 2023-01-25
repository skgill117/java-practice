package com.dsa.sorting;

import java.util.Arrays;

//time complexity O(n^2),
//but less swaps and comparisons
//best use in partially sorted array
public class InsertionSort {

	private static int comparisons;

	private static int swaps;

	public static void main(String[] args) {
		int[] arr = { 67, 34, 88, 99, 33, 66, 21, 9, 4, 38, 56, 99 };
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println();
		System.out.println("comparisons : " + comparisons + "------swaps : " + swaps);

	}

	private static void insertionSort(int[] arr) {
		int n = arr.length;

		for (int i = 1; i < n; i++) // this is dividing line
		{

			int temp = arr[i]; // remove marked element.

			int j = i - 1;

			while (j >= 0 && arr[j] > temp) // until one is smaller
			{

				arr[j + 1] = arr[j]; // shift item right

				j--; // go one more left
				swaps++;

			}

			arr[j + 1] = temp; // insert marked item.
			comparisons++;

		}
	}

}
