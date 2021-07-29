package com.practice.multithread.counter;

public class MyThread implements Runnable {

	private FileProcessor fileProcessor;

	public MyThread(FileProcessor fileProcessor) {

		this.fileProcessor = fileProcessor;
	}

	@Override
	public void run() {

		fileProcessor.processFile();

	}

}
