package com.practice.decorator;

public class XTestClass {

	public static void main(String[] args) {
		
		Beverage beverage = new Espresso();
		beverage = new Mocha(beverage);
		beverage = new Whip(beverage);
		
		System.out.println("beverage description  -  " + beverage.getDescription() + "       Cost   -   " +beverage.getCost());

	}

}
