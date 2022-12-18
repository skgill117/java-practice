package com.dsa.searching;

public class BinarySearch {

	public static void main(String[] args) {

		int arr[] = { -6, -3, -1, 6, 25, 67, 98, 202, 786, 810, 854, 915, 955 };

		int searchedKeyIndex = binarySearch(arr, 98);

		System.out.println(searchedKeyIndex);

	}

	private static int binarySearch(int[] arr, int key) {

		int low = 0, high = arr.length - 1;

		while (low <= high) {

			int mid = (low + high) / 2;

			if (key == arr[mid]) {

				return mid;

			} else if (key > arr[mid]) {

				low = mid + 1;

			} else {

				high = mid - 1;
			}
		}

		return -1;
	}

}
