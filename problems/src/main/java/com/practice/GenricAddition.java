package com.practice;

public class GenricAddition<T extends Number> {
	
	
	public T add (T a, T b) {
		Double sum;
		sum = a.doubleValue() + b.doubleValue();
		return (T)sum;
	}
	
	
	
	public static void main(String[] args) {
		
		GenricAddition<Integer> i = new GenricAddition<Integer>();
		System.out.println(i.add(23, 45));
		
		
		GenricAddition<Double> i2 = new GenricAddition<Double>();
		System.out.println(i2.add(23.5, 45.7));
		
	}
	
	

}
