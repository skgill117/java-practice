package com.practice.multithread.evenodd;

public class OddEvenTest {

	public static void main(String[] args) {
		
		int totalNumber = 20;
		
		NumberGenerater numberGenerater = new NumberGenerater(totalNumber);
		
		Thread t1 = new Thread(new MyThread(numberGenerater,0),"thread-1");
		Thread t2 = new Thread(new MyThread(numberGenerater,1),"thread-2");
		t1.start();
		t2.start();
		

	}

}
