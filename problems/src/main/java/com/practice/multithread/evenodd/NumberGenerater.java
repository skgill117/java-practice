package com.practice.multithread.evenodd;

public class NumberGenerater {
	
	int number = 1;
	
	private int totalNumbers;
	
	public NumberGenerater(int totalNumbers) {
		this.totalNumbers = totalNumbers;
	}

	public void printNumbers(int result) {
		
		synchronized (this) {
			
		
		while(number <= totalNumbers -1) {
			
			while(number%2 != result) {
				
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
			}
			System.out.println(Thread.currentThread().getName() + "  "+number++);
			notifyAll();
			
		}
		
	}	
	}

}
