package com.practice.arrays;

import java.util.Arrays;

public class RainWaterTrapping {

	public static void main(String[] args) {

		int arr[] = { 3, 1, 2, 4, 0, 1, 3, 2 };

		int trappedWater = getTrappedWater(arr);

		System.out.println(trappedWater);

	}

	private static int getTrappedWater(int[] arr) {

		int n = arr.length;

		int left[] = new int[n];
		int right[] = new int[n];
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {

			left[i] = Math.max(arr[i], max);
			max = left[i];

		}
		
		max = arr[n-1];
		for(int i = (n-1); i >= 0; i--) {
			right[i] = Math.max(max, arr[i]);
			max = right[i];
		}
		

		System.out.println(Arrays.toString(left));
		System.out.println(Arrays.toString(right));
		
		int trappedWater = 0;
		
		for(int i = 0; i < n; i++) {
		
			trappedWater += Math.min(left[i], right[i]) - arr[i];
		}

		return trappedWater;
	}

}
