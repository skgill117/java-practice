package com.practice.multithread.counter;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FileProcessorTest {

	public static void main(String[] args) {
		

		ExecutorService service = null;
		
		try {
			service = Executors.newFixedThreadPool(3);
			List<FileProcessor> list = new ArrayList<FileProcessor>(); 
			list.add(new FileProcessor());
			list.add(new FileProcessor());
			list.add(new FileProcessor());
			list.add(new FileProcessor());
			list.add(new FileProcessor());
			list.add(new FileProcessor());
			list.add(new FileProcessor());
			int count = 1;
			for(FileProcessor obj : list) {
				service.submit(new MyThread(obj),"Thread-"+count);
				count++;
			}
				
				
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			if(null != service)
				service.shutdown();
		}
	}

}
