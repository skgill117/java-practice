package com.practice.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicates {

	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
		Set<Integer> set = new HashSet();
		myList.stream().filter(n -> !set.add(n)).forEach(x -> System.out.print(x + " "));
		
		
		//second way using collection frequency
		Set<Integer> duplicates = myList.stream().filter(x -> Collections.frequency(myList, x) > 1).collect(Collectors.toSet());
		System.out.println("\r\n" + duplicates);
	}

}
