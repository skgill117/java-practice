package com.practice.multithreading;

public class RaceCheck implements Runnable {
	
	private String name;
	
	public RaceCheck(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		
		try {
			Thread.sleep(2000);
			System.out.println(name);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	public static void main(String[] args) throws Exception {
		
		Thread t1 = new Thread(new RaceCheck("1"));
		Thread t2 = new Thread(new RaceCheck("2"));
		Thread t3 = new Thread(new RaceCheck("3"));
		Thread t4 = new Thread(new RaceCheck("4"));
		Thread t5 = new Thread(new RaceCheck("5"));
		
		t5.start();
		t4.start();
		t3.start();
		t3.join();
		t2.start();
		t1.start();
		t4.join();
		t5.join();

	}

	
}
