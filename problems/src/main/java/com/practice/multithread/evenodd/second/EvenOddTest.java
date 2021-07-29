package com.practice.multithread.evenodd.second;

public class EvenOddTest {

	public static void main(String[] args) {
		
		
		EvenOddPrinter evenOddPrinter = new EvenOddPrinter(20);
		
		Thread t1 = new Thread(new OddPrinterThread(evenOddPrinter), "Thread-1");
		Thread t2 = new Thread(new EvenPrinterThread(evenOddPrinter),"Thread-2");
		t1.start();
		t2.start();

	}

}
