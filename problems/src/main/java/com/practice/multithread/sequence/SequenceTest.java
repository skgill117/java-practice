package com.practice.multithread.sequence;

public class SequenceTest {

	public static void main(String[] args) {
		
		int totalNumber = 20;
		
		NumberGenerater numberGenerater = new NumberGenerater(totalNumber);
		
		Thread t1 = new Thread(new MyThread(numberGenerater,1),"thread-1");
		Thread t2 = new Thread(new MyThread(numberGenerater,2),"thread-2");
		Thread t3 = new Thread(new MyThread(numberGenerater,0),"thread-3");
		t1.start();
		t2.start();
		t3.start();
		

	}

}
