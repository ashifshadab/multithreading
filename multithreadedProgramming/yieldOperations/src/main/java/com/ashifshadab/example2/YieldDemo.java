package com.ashifshadab.example2;

public class YieldDemo {

	public static void main(String[] args) {

		WorkerThread workerThread = new WorkerThread();
		
		workerThread.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Main Thread Doing Work::"+i);
		}

	}

}
