package com.practice.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

	public static void main(String[] args) {
		List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 1, 2, 3);
		System.out.println("After removing duplicates : ");
		integerList.stream().collect(Collectors.toSet()).forEach(x -> System.out.print(x + " "));

	}

}
