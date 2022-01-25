package com.dsa.sorting;

import java.util.Arrays;


/**
 * @author shivk
 * better than bubblesort in terms of swaps.
 *
 */
public class SelectionSort {

	private static int comparisons;

	private static int swaps;

	public static void main(String[] args) {
		int[] arr = { 67, 34, 88, 99, 33, 66, 21, 9, 4, 38, 56, 99 };
		selectionSort(arr);
		Arrays.stream(arr).forEach(n -> System.out.print(n + " "));
		System.out.println();
		System.out.println("comparisons : " + comparisons + "------swaps : " + swaps);

	}

	private static void selectionSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {

			int min_idx = i;

			for (int j = i + 1; j < n; j++) {

				if (arr[j] < arr[min_idx]) {

					min_idx = j;
					comparisons++;

				}
			}
			/* now we have got minimum element in subArray,
			 *  swap this with first element. 
			 *  */
			int temp = arr[i];
			arr[i] = arr[min_idx];
			arr[min_idx] = temp;
			swaps++;
		}
	}

}
