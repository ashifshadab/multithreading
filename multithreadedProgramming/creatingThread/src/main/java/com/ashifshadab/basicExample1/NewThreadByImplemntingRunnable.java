package com.ashifshadab.basicExample1;

public class NewThreadByImplemntingRunnable implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread()+" Thread Printing::"+i);
		}

	}

}
