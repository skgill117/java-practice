package com.practice.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {

		Map<College, Integer> map = new HashMap<>();
		map.put(new College("abc"), 2);
		map.put(new College("abc"), 3);
		map.put(new College("abc"), 4);
		map.put(new College("abc"), 5);
		//map.put(null, 9); //null is allowed in map but only once

		for (Map.Entry<College, Integer> entry : map.entrySet()) {

			System.out.println(entry.getKey().getRegistrationNumber() + "--------------------------" + entry.getValue());
		}

	}

}
