package com.practice.strings;

import java.util.HashMap;
import java.util.Map;

public class DistinctCharacterCount {

	public static void main(String[] args) {
		String str = "abcdABCDabcd";
		Map<String, Integer> map = new HashMap<>();
		str.chars().forEach(
			x -> {
				if(!map.containsKey(Character.toString(x))) {
					map.put(Character.toString(x), 1);
				}else {
					map.put(Character.toString(x), map.get(Character.toString(x)) + 1);
				}
		});
		
		System.out.println(map);
		
		

	}

}
