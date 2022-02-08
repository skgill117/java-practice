package com.dsa.sorting;

import java.util.Arrays;

//time complexity O(n^2),
//but less swaps and comparisons
public class InsertionSort {

	private static int comparisons;

	private static int swaps;

	public static void main(String[] args) {
		int[] arr = { 67, 34, 88, 99, 33, 66, 21, 9, 4, 38, 56, 99 };
		System.out.println(Arrays.toString(arr));
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println();
		System.out.println("comparisons : " + comparisons + "------swaps : " + swaps);

	}

	private static void insertionSort(int[] arr) {
		int n = arr.length;

		for (int i = 1; i < n; i++) // this is dividing line
		{

			int key = arr[i]; // remove marked element. 
			
			int j = i;

			while (j > 0 && arr[j-1] >= key)   // until one is smaller
			{

				arr[j] = arr[j-1];  // shift item right

				j--;                  // go one more left
				swaps++;

			}
			
			arr[j] = key;            //insert marked item.
			comparisons++;

		}
	}

}
