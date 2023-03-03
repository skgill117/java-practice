package com.practice.decorator;

public class Espresso extends Beverage {

	@Override
	public String getDescription() {
		return "espresso";

	}

	@Override
	public double getCost() {
		return 20;
	}

}
