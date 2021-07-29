package com.practice.multithread.evenodd.second;

public class EvenPrinterThread implements Runnable{
	
	private EvenOddPrinter evenOddPrinter;
	
	
	public EvenPrinterThread(EvenOddPrinter evenOddPrinter) {
		super();
		this.evenOddPrinter = evenOddPrinter;
	}

	@Override
	public void run() {
		evenOddPrinter.printEvenNumbers();
		
	}

}