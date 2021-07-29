package com.practice.multithread.sequencebyexecutor;

public class NumberGenerater {
	
	private int totalNumbers;
	int number = 1;
	
	public NumberGenerater(int totalNumbers) {
		this.totalNumbers = totalNumbers;
	}

	public void printNumbers(int result) {
		
		synchronized (this) {
			
		
		while(number < totalNumbers -1) {
			
			while(number%3 != result) {
				
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
			}
			System.out.println(Thread.currentThread().getName() + "  "+ number++);
			notifyAll();
			
		}
		
	}	
	}

}
