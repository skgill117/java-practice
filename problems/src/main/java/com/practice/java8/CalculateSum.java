package com.practice.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CalculateSum {

	public static void main(String[] args) {

		List<Integer> integerList = Arrays.asList(4, 5, 6, 7, 1, 2, 3);

		// calculate sum
		System.out.println("sum ->  " + integerList.stream().mapToInt(x -> x).sum());

		// one onother way is using reduce, here we can do any operation like sum,
		// multiplication etc.
		Optional<Integer> opt = integerList.stream().reduce((x, y) -> x + y);
		System.out.println("sum ->  " + opt.get());

		// multiplication
		System.out.println("multiplication ->  " + integerList.stream().reduce((x, y) -> x * y).get());

		// calculate average, average can have decimal so we take double
		System.out.println("average ->  " + integerList.stream().mapToDouble(x -> x).average().getAsDouble());
		

	}

}
