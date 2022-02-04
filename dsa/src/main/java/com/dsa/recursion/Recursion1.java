package com.dsa.recursion;

// printing counting increasing order.
public class Recursion1 {

	public static void main(String[] args) {
     
		printDecreasing(10);
		
	}

	private static void printDecreasing(int n) {
		
		if(n == 0) {
			return;
		}
		else {
			System.out.println(n);
			printDecreasing(n - 1);
		}
		
	}

}
