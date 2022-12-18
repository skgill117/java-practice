package com.practice.strings;

import java.util.Random;

public class GenerateRandomString {

	public static void main(String[] args) {

		int leftLimit = 48; // numeral '0'
		int rightLimit = 123; // letter 'z'
		int targetStringLength = 10;
		Random random = new Random();

		String generatedString = random.ints(leftLimit, rightLimit)
				.filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97)).limit(targetStringLength)
				.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();

		System.out.println(generatedString);
	}

}
