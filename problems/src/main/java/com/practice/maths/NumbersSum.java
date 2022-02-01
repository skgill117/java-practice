package com.practice.maths;

public class NumbersSum {

	public static void main(String[] args) {
		
		int n = 100;
		
		int sum = 0;
		for(int i = 1; i<=100; i++) {
			sum += i;
		}
		
		System.out.println(sum);
		
		int sum2 = n*(n+1)/2;
		System.out.println(sum2);

	}
	
	
	

}
