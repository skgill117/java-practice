package com.practice.multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerTest implements Runnable {
	
	private AtomicInteger atomicInteger = new AtomicInteger();
	private int x = 0;
	
	@Override
	public void run() {
		
		for(int i = 0; i < 5000; i++) {
			
			atomicInteger.getAndIncrement();
			x++;
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
		
		System.out.println("atomic integer result -> " + atomicIntegerTest.atomicInteger.get());
		System.out.println("normal integer result -> " + atomicIntegerTest.x);
		

	}

	

}
