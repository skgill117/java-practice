package com.practice.multithread.sequencebyexecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SequenceTest {

	public static void main(String[] args) {
		
		int totalNumber = 20;
		
		NumberGenerater numberGenerater = new NumberGenerater(totalNumber);
		
		ExecutorService service = Executors.newFixedThreadPool(3);
		
		service.submit(new MyThread(numberGenerater,1),"thread-1");
		service.submit(new MyThread(numberGenerater,2),"thread-2");
		service.submit(new MyThread(numberGenerater,0),"thread-3");
		
	
		service.shutdown();
		

	}

}
