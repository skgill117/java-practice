package com.practice.java8;

import java.util.Arrays;
import java.util.List;

public class Counter {

	public static void main(String[] args) {

		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
		long count = myList.stream().count();
		System.out.println(count);

		List<String> stringList = Arrays.asList("Hello", "Interview", "Questions", "Answers", "Ram", "for");
		long count2 = stringList.stream().filter(str -> str.length() > 3).count();
		System.out.println("String count with greater than 3 digit : " + count2);

		stringList.stream().filter(str -> str.length() > 3).forEach(System.out::println);
	}

}
