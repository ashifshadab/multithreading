package com.ashifshadab.basicExample2;

public class NewThreadByExtendingThread extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread() + " Thread Printing::" + i);
		}
	}

}
