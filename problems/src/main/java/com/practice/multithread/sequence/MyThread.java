package com.practice.multithread.sequence;

public class MyThread implements Runnable {

	private NumberGenerater numberGenerater;
	
	private int result;

	public MyThread(NumberGenerater numberGenerater, int result) {

		this.numberGenerater = numberGenerater;
		this.result = result;
	}

	@Override
	public void run() {

		numberGenerater.printNumbers(result);

	}

}
