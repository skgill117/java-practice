package com.practice.maths;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		int tempA = a;
		int tempB = b;
		
		a = (tempA+tempB)-tempA;
		b = (tempA+tempB)-tempB;
		
		System.out.println("a = " + a +"  b = "+b);
		

	}

}
