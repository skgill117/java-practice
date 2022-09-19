package com.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<>();
	  //set.add(null);
		set.add(20);
		set.add(78);
		set.add(54);
		set.add(4);
		set.add(78); // duplicate not allowed.
		System.out.println(set);

		List<Integer> list = new ArrayList<>(set);
		list.sort((x, y) -> x.compareTo(y));
		System.out.println(list);

		list.sort((x, y) -> -x.compareTo(y));
		System.out.println(list);

	}

}
