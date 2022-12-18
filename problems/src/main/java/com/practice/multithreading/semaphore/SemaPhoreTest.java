package com.practice.multithreading.semaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SemaPhoreTest {

	public static void main(String[] args) {
		
		Connection connection = Connection.getConnection();
		
		ExecutorService service = Executors.newCachedThreadPool();
		
		for(int i = 0; i <= 300; i++) {
			
			service.execute(new Runnable() {
				
				@Override
				public void run() {
					try {
						connection.connect();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			});
		}

	}

}
