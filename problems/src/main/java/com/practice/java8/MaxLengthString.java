package com.practice.java8;

import java.util.Arrays;
import java.util.Comparator;

public class MaxLengthString {

	public static void main(String[] args) {

		String[] arr = { "sandeep", "shiv", "bharti", "raman" };

		String s = Arrays.stream(arr).max(Comparator.comparing(e -> e.toString().length())).get();
				
		System.out.println(s);
	}

}
