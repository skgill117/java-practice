package com.practice.multithread.counter;

public class FileProcessor {

	static volatile int  noOfFileProcessed = 0;

	public void processFile() {

		System.out.println("file processed by -" + Thread.currentThread().getName());
		
		noOfFileProcessed = noOfFileProcessed + 1;

		System.out.println("no of file processed " + noOfFileProcessed);

	}

	

}
