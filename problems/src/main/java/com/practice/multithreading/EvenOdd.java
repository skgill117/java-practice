package com.practice.multithreading;

public class EvenOdd {
	
	private int number = 1;

	public void printOddNumber() {
		synchronized (this) {
			while(number < 20) {
				if(number % 2 == 0) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				System.out.println(Thread.currentThread().getName() + ": " + number++);
				notify();
			}
		}
		
	}
	
	public void printEvenNumber() {
		synchronized (this) {
			while(number < 20) {
				if(number % 2 != 0) {
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				System.out.println(Thread.currentThread().getName() + ": " + number++);
				notify();
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		EvenOdd evenOdd = new EvenOdd();
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				evenOdd.printEvenNumber();
				
			}
		}, "Thread2");
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				evenOdd.printOddNumber();
			}
		},  "Thread1");
		t1.start();
		t2.start();
	}

}
