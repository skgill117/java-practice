package com.practice.arrays;

/*The cost of a stock on each day is given in an array,
 *  find the max profit that you can make by buying and selling in those days.
 *  For example, if the given array is {100, 180, 260, 310, 40, 535, 695}, the maximum profit can
 *  earned by buying on day 4 and sell on day 6.
 *    */

public class MaximumProfitSingleSell {

	public static void main(String[] args) {

		int[] arr = { 100, 180, 260, 310, 40, 535, 695 };
		int maximumProfit = findMaxProfit(arr, arr.length);
		System.out.println(maximumProfit);

	}

	static int findMaxProfit(int arr[], int length) {
		int maxProfit = 0;
		int minSoFar = arr[0];
		for(int i = 0; i < length; i++) {
			minSoFar = Math.min(minSoFar, arr[i]);
			int currentProfit = arr[i] - minSoFar;
			maxProfit = Math.max(maxProfit, currentProfit);
		}
		return maxProfit;
	}

}
