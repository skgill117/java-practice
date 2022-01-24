package com.practice.java8;

import java.util.Arrays;
import java.util.List;

public class OddNumberCheckList {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(2,4,78,98,27);
		
		System.out.println(listContainsOdd(list));

	}

	private static boolean listContainsOdd(List<Integer> list) {
		return list.stream().anyMatch(i -> i%2 != 0);
	}

}
