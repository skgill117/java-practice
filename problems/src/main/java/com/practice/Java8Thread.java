/**
 * 
 */
package com.practice;

public class Java8Thread {


	public static void main(String[] args)  {
		
		
		Runnable r = () -> {
			                try {
								Thread.sleep(5000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
			                System.out.println(Thread.currentThread().getName());
		                   };
		
		Thread t = new Thread(r,"t2");
		t.start();
		System.out.println("main thread name- " + Thread.currentThread().getName());
		
		
		
	}

}
