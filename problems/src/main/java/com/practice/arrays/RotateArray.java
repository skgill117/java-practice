package com.practice.arrays;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		
		int[] arr = {4,6,1,9,3,42,67,7};
		
		System.out.println(Arrays.toString(arr));
		
		int left = 0;
		int right = arr.length - 1;
		
		while(left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
