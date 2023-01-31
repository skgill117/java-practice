package com.practice.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ConcatenateStreams {

	public static void main(String[] args) {
		List<Integer> integerList1 = Arrays.asList(1, 2, 3, 4);
		List<Integer> integerList2 = Arrays.asList(5, 6, 7);
		Stream<Integer> concatStream = Stream.concat(integerList1.stream(), integerList2.stream());
		concatStream.forEach(x -> System.out.print(x + " "));
		
		

	}

}
