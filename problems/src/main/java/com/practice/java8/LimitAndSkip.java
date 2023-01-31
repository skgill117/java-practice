package com.practice.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LimitAndSkip {

	public static void main(String[] args) {
	
		List<Integer> list = Arrays.asList(1, 3, 34, 76, 76, 23, 54, 98, 78, 56, 43, 67, 12, 25, 78, 45, 98, 45, 14);
		
		//get first 5 numbers -> sum of 5 numbers
		
		
		//limit
		List<Integer> l = list.stream().limit(5).collect(Collectors.toList());
		System.out.println(l);
		
		Integer sum = list.stream().limit(5).reduce((a, b) -> a+b).get();
		System.out.println(sum);
		
		//skip
		List<Integer> ls = list.stream().skip(5).collect(Collectors.toList());
		System.out.println(ls);
		
		Integer sumk = list.stream().skip(5).reduce((a, b) -> a+b).get();
		System.out.println(sumk);
		
		
		//calculate 2nd highest
		
		Integer secondHighest = list.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
		System.out.println(secondHighest);
		
		//calculate 2nd lowest
		Integer secondLowest = list.stream().sorted().distinct().skip(1).findFirst().get();
		System.out.println(secondLowest);
		

	}

}
