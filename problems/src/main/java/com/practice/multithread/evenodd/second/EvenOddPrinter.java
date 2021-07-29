package com.practice.multithread.evenodd.second;

public class EvenOddPrinter {
	
	
	private int totalNumbers;
	
	private boolean flag;
	
	private int number = 1;
	
	public EvenOddPrinter(int totalNumbers) {
		
		this.totalNumbers = totalNumbers;
	}
	
	public void printOddNumbers() {
		
		synchronized (this) {
			
			while(number <= totalNumbers) {
				
				while(flag) {
					
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				System.out.println(Thread.currentThread().getName()+" ---- " + number++);
				flag = true;
				notify();
			}
			
		}
		
		
	}
	
	public void printEvenNumbers() {
		
		synchronized (this) {
			
			while(number <= totalNumbers) {
				
				while(!flag) {
					
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				System.out.println(Thread.currentThread().getName()+" ---- " + number++);
				flag = false;
				notify();
			}
			
		}
		
		
	}

}
