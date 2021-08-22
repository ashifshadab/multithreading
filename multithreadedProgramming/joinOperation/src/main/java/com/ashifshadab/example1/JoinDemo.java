package com.ashifshadab.example1;

public class JoinDemo {

	public static void main(String[] args) {

		WorkerThread workerThread = new WorkerThread();

		workerThread.start();

		try {

			workerThread.join();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		for (int i = 0; i < 5; i++) {

			System.out.println("Main Thread Doing Work::" + i);

		}

	}

}
