package com.practice.java8;

import java.util.Comparator;
import java.util.stream.Stream;

public class MaxMinJava8 {

	public static void main(String[] args) {

		Integer min = Stream.of(1, 2, 3, 4, 5, 6, 7).min(Comparator.comparing(x -> x)).get();
		System.out.println("The Minimum number is: " + min);

		Integer max = Stream.of(1, 2, 3, 4, 5, 6, 7).max(Comparator.comparing(x -> x)).get();
		System.out.println("The Maximum number is: " + max);

	}

}
