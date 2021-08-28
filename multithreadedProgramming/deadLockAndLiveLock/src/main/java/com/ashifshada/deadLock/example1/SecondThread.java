package com.ashifshada.deadLock.example1;

public class SecondThread extends Thread {

	String lock1;

	String lock2;

	public SecondThread(String lock1, String lock2) {
		super();
		this.lock1 = lock1;
		this.lock2 = lock2;
	}

	public void run() {

		synchronized (lock2) {

			System.out.println(Thread.currentThread().getName() + " Locked on " + lock2);

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			synchronized (lock1) {

				System.out.println(Thread.currentThread().getName() + " Locked on " + lock1);
			}
		}

	}
}
