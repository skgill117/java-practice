package com.practice.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NonRepeatingNumbers {

	public static void main(String[] args) {
		
		int[] arr = {4,3,6,8,23,56,43,98,44,6,3,23,98,564,87,23};
		System.out.println(Arrays.toString(arr));
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < arr.length; i++) {
			
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
			}else {
				map.put(arr[i], 1 + map.get(arr[i]));
			}
			
		}
		
		map.entrySet().stream().filter(x -> x.getValue() == 1).forEach(x -> System.out.println(x.getKey()));

	}

}
