package com.practice.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramSeparation {

	public static void main(String[] args) {
		
		String[] arr = {"cat", "dog", "ele", "tac", "skl", "atc"};
		Map<String,List<String>> map = new HashMap<>();
		
		for(int i = 0; i < arr.length; i++) {
			String s = arr[i];
			char[] charArr = s.toCharArray();
			Arrays.sort(charArr);
			String sortedString = String.valueOf(charArr);
			
			if(!map.containsKey(sortedString)) {
				List<String> list = new ArrayList<String>();
				list.add(s);
				map.put(sortedString, list);
			}else {
				List<String> mapValue = map.get(sortedString);
				mapValue.add(s);
				map.put(sortedString, mapValue);
			}
		}
		
		for(Map.Entry<String, List<String>> entry : map.entrySet()) {
			if(entry.getValue().size() >1)
			System.out.print(entry.getValue());
		}

	}

}
