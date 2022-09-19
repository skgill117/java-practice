package com.practice.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {

		Map<Student, Integer> map = new HashMap<>();
		map.put(new Student("abc"), 2);
		map.put(new Student("abc"), 3);
		map.put(new Student("abc"), 4);
		map.put(new Student("abc"), 5);
		//map.put(null, 9); //null is allowed in map but only once

		for (Map.Entry<Student, Integer> entry : map.entrySet()) {

			System.out.println(entry.getKey().getRegistrationNumber() + "--------------------------" + entry.getValue());
		}

	}

}
