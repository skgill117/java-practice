package com.practice.arrays;

import java.util.Arrays;

public class ShiftAllZerosLeft {

	public static void main(String[] args) {
		
		int[] arr = {4,55,0,33,42,0,35,52,8,3,0,55,0};
		System.out.println(Arrays.toString(arr));
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 0) {
				for(int j = i; j > 0; j--) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
