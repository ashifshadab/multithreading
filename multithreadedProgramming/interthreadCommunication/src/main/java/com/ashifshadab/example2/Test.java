package com.ashifshadab.example2;

public class Test {

	public static void main(String[] args) {

		Test test = new Test();

		WorkerThread workerThread = new WorkerThread();
		workerThread.setName("CALCULATOR");

		workerThread.start();

		
		getTotal(workerThread);

		//test.print();
	}

	private static void getTotal(WorkerThread workerThread) {
		synchronized (workerThread) {

			System.out.println(Thread.currentThread().getName() + " THREAD TRYING TO CALL WAIT() METHOD");

			try {

				workerThread.wait();

			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println(Thread.currentThread().getName() + " THREAD GOT NOTIFICATION");

			System.out.println("The sum of 100 number is :: " + workerThread.total);
		}
	}

	private void print() {

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

}
