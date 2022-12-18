package com.dsa.searching;

public class BinarySearchInfiniteArray {

	public static void main(String[] args) {

		int arr[] = { -6, -3, -1, 6, 25, 67, 98, 202, 786, 810, 854, 915, 955 };

		int idx = infiniteSearch(arr, 98);
		System.out.println(idx);

	}

	private static int infiniteSearch(int[] arr, int key) {
		int low = 0;
		int high = 1;

		while (arr[high] < key) {

			low = high;
			high = 2 * high;

		}
		return binarySearch(arr, key, low, high);
	}

	private static int binarySearch(int[] arr, int key, int low, int high) {

		while (low <= high) {
			
			int mid = (low + high) / 2;

			if (arr[mid] == key) {
				
				return mid;
				
			} else if (arr[mid] > key) {
				
				low = mid + 1;
				
			} else {
				
				high = mid - 1;
			}

		}
		return -1;
	}

}
