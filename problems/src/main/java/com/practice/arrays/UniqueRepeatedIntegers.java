package com.practice.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*we have array of repeating integers, 
remove minimum element so that each 
element repeat unique times.*/
public class UniqueRepeatedIntegers {

	public static void main(String[] args) {

		int[] arr = {5, 3, 3, 2, 5, 2, 3, 2};
		//int[] arr = {1, 1, 1, 2, 2, 2};

		System.out.println(solution(arr));

	}

	private static int solution(int[] arr) {
		
		int elementToRemove = 0;
		
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {

			Integer val = arr[i];
			
			if (!map.containsKey(val)) {
				
				map.put(val, 1);
				
			} else {
				
				map.put(val, map.get(val) + 1);
			}
		}
		
		
		List<Integer> list =  new ArrayList<Integer>(map.values());
		list.sort((x,y) -> x.compareTo(y));
		System.out.println(list);
		
		Integer prevOccurence = list.get(0);
		
		for(int i = 1; i < list.size(); i ++) {
			
			if(prevOccurence.equals(list.get(i)) && list.get(i) > 1) {
				elementToRemove = elementToRemove + 1;
				prevOccurence = list.get(i) - 1;
			}else {
				prevOccurence = list.get(i);
			}
			
		}

		return elementToRemove;
	}

}
