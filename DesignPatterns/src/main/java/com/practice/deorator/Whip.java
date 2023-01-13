package com.practice.deorator;

public class Whip extends Condiments {

	private Beverage beverage;

	public Whip(Beverage beverage) {
		
		this.beverage = beverage;

	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + " with Whip";
	}

	@Override
	public double getCost() {
		return beverage.getCost() + 30;
	}

}
