package com.practice.multithreading;

public class VolatileTest implements Runnable {

	private boolean stopRequested;

	public void run() {
		while (!stopRequested) {
			System.out.println(stopRequested);
		}
		System.out.println(this.stopRequested);
		System.out.println("child completed");
	}

	public static void main(String[] args) throws InterruptedException {

		VolatileTest test = new VolatileTest();
		Thread t1 = new Thread(test);
		t1.start();
		Thread.sleep(1000);
		test.stopRequested = true;
		System.out.println("main completed");

	}

}
