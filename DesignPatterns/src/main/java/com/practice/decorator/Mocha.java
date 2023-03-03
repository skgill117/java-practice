package com.practice.decorator;

public class Mocha extends Condiments {
	
	private Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public String getDescription() {
		return beverage.getDescription() + " with Mocha";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return beverage.getCost() + 10;
	}

}
