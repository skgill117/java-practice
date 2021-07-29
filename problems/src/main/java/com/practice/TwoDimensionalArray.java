package com.practice;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		
		int[][] arr = {{1,2},{3,4},{5,6}};
		
		double maxDistance = 0;
		
		for(int i= 0; i < arr.length;i++) {
			
			int[] a = arr[i];
			int[] b = arr[i+1];
			maxDistance = getDistance(a,b);
			
		}
	

}

	private static double getDistance(int[] a, int[] b) {
		
		return 0;
	}
	
}
