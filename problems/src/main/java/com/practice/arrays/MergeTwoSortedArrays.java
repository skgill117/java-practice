package com.practice.arrays;

import java.util.Arrays;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {

		int[] arrA = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 20 };
		int[] arrB = { 2, 4, 6, 8, 10, 12 };

		mergeSortedArrays(arrA, arrB);
		System.out.println(Arrays.toString(arrA));
		System.out.println(Arrays.toString(arrB));

	}

	private static void mergeSortedArrays(int[] arrA, int[] arrB) {
		
		int m = arrA.length;
		int n = arrB.length;
		
		int i = m - 1;
		int j = 0;
		
		while(i >= 0 && j < n) {
			if(arrA[i] >= arrB[j]) {
				int temp = arrA[i];
				arrA[i] = arrB[j];
				arrB[j] = temp;
				
			}
			i--;
			j++;
		}
		
		Arrays.sort(arrA);
		Arrays.sort(arrB);

	}

	



}
