package com.practice.multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerTest implements Runnable {
	
	private AtomicInteger atomicInteger = new AtomicInteger();
	
	@Override
	public void run() {
		
		for(int i = 0; i < 5; i++) {
			
			atomicInteger.getAndIncrement();
		}
		
	}

	public static void main(String[] args) throws InterruptedException {
		
		AtomicIntegerTest atomicIntegerTest = new AtomicIntegerTest();
		Thread t1 = new Thread(atomicIntegerTest);
		Thread t2 = new Thread(atomicIntegerTest);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(atomicIntegerTest.atomicInteger.get());
		

	}

	

}
