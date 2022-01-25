/**
 * 
 */
package com.practice.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * @author shivk Given an array of integers nums and an integer target, return
 *         indices of the two numbers such that they add up to target.
 * 
 *         You may assume that each input would have exactly one solution, and
 *         you may not use the same element twice.
 * 
 *         You can return the answer in any order.
 * 
 * 
 * 
 *         Example 1:
 * 
 *         Input: nums = [2,7,11,15], target = 9 Output: [0,1] Output: Because
 *         nums[0] + nums[1] == 9, we return [0, 1]. Example 2:
 * 
 *         Input: nums = [3,2,4], target = 6 Output: [1,2]
 * 
 *         Follow-up: Can you come up with an algorithm that is less than O(n2)
 *         time complexity?
 *
 */
public class TwoSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num[] = { 3, 2, 4, 1, 0};
		int[] result = twoSum(num, 6);
		for (int i : result) {
			System.out.println(i);
		}

	}

	public static int[] twoSum(int[] nums, int target) {
		int[] arr = new int[2];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {

			int diff = target - nums[i];
			if (map.containsKey(diff)) {
				arr[0] = i;
				arr[1] = map.get(diff);
			} else {
				map.put(nums[i], i);
			}

		}

		return arr;

	}

}
