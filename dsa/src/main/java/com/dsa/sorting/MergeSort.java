package com.dsa.sorting;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		
		int[] arr = { 67, 34, 88, 99, 33, 66, 21, 9, 4, 38, 56, 99 };
		
		System.out.println(Arrays.toString(arr));
		
		mergeSort(arr, 0, (arr.length -1));
		
		System.out.println(Arrays.toString(arr));

	}

	private static void mergeSort(int[] arr, int left, int right) {
		
		if(left < right) {
			
			int mid = (left + right)/2;
			
			mergeSort(arr, left, mid);
			
			mergeSort(arr, mid+1, right);
			
			merge(arr, left, mid, right);
		}
			
		
	}

	private static void merge(int[] arr, int left, int mid, int right) {
		
	}



}
