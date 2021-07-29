package com.practice.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Student,Integer> map = new HashMap<>();
		map.put(new Student("abc"), 2);
		map.put(new Student("abc"), 3);
		map.put(new Student("abc"), 4);
		map.put(new Student("abc"), 5);
		
		//Integer value = map.get(new Student("abc"));
		
		//System.out.println("--------------------------"+value);
		
		
		  for(Map.Entry<Student,Integer> entry : map.entrySet()) {
		  
		  System.out.println(entry.getKey().getRegistrationNumber()+
		  "--------------------------"+entry.getValue()); }
		 

	}

}
