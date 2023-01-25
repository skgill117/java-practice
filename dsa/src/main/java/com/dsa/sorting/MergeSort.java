package com.dsa.sorting;

import java.util.Arrays;

/*time complexity best, worst, avg case - O(nlogn),
 * space complexity O(n). */
public class MergeSort {

	public static void main(String[] args) {

		int[] arr = { 67, 34, 88, 99, 33, 66, 21, 9, 4, 38, 56, 99 };

		System.out.println(Arrays.toString(arr));

		mergeSort(arr, 0, (arr.length - 1));

		System.out.println(Arrays.toString(arr));

	}

	private static void mergeSort(int[] arr, int left, int right) {

		if (left < right) {

			int mid = left + (right - left) / 2;

			mergeSort(arr, left, mid);

			mergeSort(arr, mid + 1, right);

			merge(arr, left, mid, right);
		}

	}

	private static void merge(int[] arr, int left, int mid, int right) {

		int[] b = new int[arr.length];
		int i = left;
		int j = mid + 1;
		int k = left;

		while (i <= mid && j <= right) {
			if (arr[i] < arr[j]) {
				b[k] = arr[i];
				i++;
			} else {
				b[k] = arr[j];
				j++;
			}
			k++;
		}

		if (i > mid) {
			while (j <= right) {
				b[k] = arr[j];
				k++;
				j++;
			}

		} else {
			while (i <= mid) {
				b[k] = arr[i];
				k++;
				i++;
			}
		}

		for (k = left; k <= right; k++) {
			arr[k] = b[k];
		}
	}

}
