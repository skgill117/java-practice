package com.practice.java8;

import java.util.StringJoiner;

/*add prefix and suffix in a given String we will
 *  use StringJoiner class, a newly added in Java 8.*/
public class StringPrefixSuffix {

	public static void main(String[] args) {
		StringJoiner stringJoiner = new StringJoiner(",", "#", "#");
		stringJoiner.add("Interview");
		stringJoiner.add("Questions");
		stringJoiner.add("Answers");
		System.out.println("String after adding # in suffix and prefix :");
		System.out.println(stringJoiner);
	}

}
