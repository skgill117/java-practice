package com.practice.java8;

import java.util.Random;

/*generate 10 random number using forEach.
 *  Here we are using Random class to generate Random number.*/
public class RandomNumberGenerator {

	public static void main(String[] args) {
		Random random = new Random();
	    random.ints().limit(10).forEach(System.out::println);
	}

}
