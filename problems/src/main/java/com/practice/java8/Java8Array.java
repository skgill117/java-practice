package com.practice.java8;

import java.util.Arrays;

public class Java8Array {
	
	
	public static void main(String[] args) {
		

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 12, 17, 87, 56, 78 };
		Arrays.stream(arr).filter(s -> s % 2 == 0).forEach(s -> System.out.println(s));
		
		
	}

}
