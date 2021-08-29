package com.ashifshadab.example2;

public class WorkerThread extends Thread {

	int total = 0;

	public void run() {

		calculate();
		//afterNotify();
	}

	private void afterNotify() {
		
		for (int i = 0; i < 5; i++) {

			System.out.println(
					Thread.currentThread().getName() + " HOLD LOCK ::" + Thread.currentThread().holdsLock(this));

			try {
				Thread.currentThread().sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println(Thread.currentThread().getName() + " Printing " + i);
		}
		System.out.println(Thread.currentThread().getName() + " Printing OVER");
	}

	private void calculate() {
		
		synchronized (this) {

			System.out.println(Thread.currentThread().getName() + " THREAD START CALCULATION");

			for (int i = 0; i <= 100; i++) {

				total = total + i;
			}

			System.out.println(Thread.currentThread().getName() + " THREAD TRYING TO GIVE NOTIFICATION");

			this.notify();
			
			afterNotify();
		}
		//afterNotify();
	}

}
