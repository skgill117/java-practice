package com.practice.multithread.evenodd.second;

public class OddPrinterThread implements Runnable{
	
	private EvenOddPrinter evenOddPrinter;
	
	
	public OddPrinterThread(EvenOddPrinter evenOddPrinter) {
		super();
		this.evenOddPrinter = evenOddPrinter;
	}

	@Override
	public void run() {
		evenOddPrinter.printOddNumbers();
		
	}

}
