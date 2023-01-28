package com.dsa.searching;

public class SearchInSortedAndRoatedArray {

	public static void main(String[] args) {

		int arr[] = { 60, 70, 80, 90, 100, 110, 120, 10, 20, 30, 40, 50 };

		int searchedKeyIndex = binarySearch(arr, 40);

		System.out.println(searchedKeyIndex);

	}

	private static int binarySearch(int[] arr, int key) {
		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {

			int mid = low + (high - low) / 2;

			if (key == arr[mid])
				return mid;

			if (arr[low] < arr[mid]) {              // it means left part is sorted

				if (key >= arr[low] && key < arr[mid]) {

					high = mid - 1;

				} else {

					low = mid + 1;
				}
			}else {                                      //else right part is sorted.
				if(key > arr[mid] && key <= arr[high]) {
					
					low = mid + 1;
					
				}else {
					
					high = mid - 1;
				}
			}

		}
		return -1;
	}

}
