package com.practice;

public class FinalVariableTest {

	private final int number;
	
	public FinalVariableTest(int i) {
		this.number = i;
	}

	
	public int getNumber() {
		return number;
	}

	public static void main(String[] args) {
		
		FinalVariableTest obj = new FinalVariableTest(6);
		//obj.number = 10;  // can not change final variable
		System.out.println(obj.number);

	}

}
