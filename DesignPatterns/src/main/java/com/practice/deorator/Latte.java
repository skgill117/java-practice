package com.practice.deorator;

public class Latte extends Beverage {

	@Override
	public String getDescription() {
		return "latte";

	}

	@Override
	public double getCost() {
		return 30;
	}

}
