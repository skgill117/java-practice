/**
 * 
 */
package com.dsa.sorting;

import java.util.Arrays;

/**
 * @author shivkumar01 complexity avg case - O(nlogn); complexity worst case -
 *         O(n^2); space complexity - O(n) recursion stack
 *
 */
public class QuickSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] arr = { 67, 34, 88, 99, 33, 66, 21, 9, 4, 38, 56, 99 };
		int low = 0;
		int high = arr.length - 1;
		quickSort(arr, low, high);
		System.out.println(Arrays.toString(arr));

	}

	private static void quickSort(int[] arr, int low, int high) {

		if (low < high) {
			int pivotIdx = partition(arr, low, high);
			quickSort(arr, low, pivotIdx - 1);
			quickSort(arr, pivotIdx + 1, high);
		}

	}

	private static int partition(int[] arr, int low, int high) {

		int pivot = arr[low];
		int i = low;
		int j = high;

		while (i < j) {

			while ((i < arr.length) && arr[i] <= pivot)
				i++;
			while (arr[j] > pivot)
				j--;

			if (i < j) {
				swap(arr, i, j);
			}

		}

		swap(arr, j, low);

		return j;
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
