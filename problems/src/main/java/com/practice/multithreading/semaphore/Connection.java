package com.practice.multithreading.semaphore;

import java.util.concurrent.Semaphore;

public class Connection {

	private static Connection instance = new Connection();

	private int noOfconnections;

	private Semaphore semaPhore = new Semaphore(10, true);

	public static Connection getConnection() {

		return instance;
	}

	public void connect() throws InterruptedException {

		semaPhore.acquire();

		synchronized (this) {

			noOfconnections++;

			System.out.println("current connections : " + noOfconnections);
		}

		Thread.sleep(2000);

		synchronized (this) {
			noOfconnections--;
		}

		if (null != semaPhore) {
			semaPhore.release();
		}

	}

}
