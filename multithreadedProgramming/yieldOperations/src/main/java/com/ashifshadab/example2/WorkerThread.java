package com.ashifshadab.example2;

public class WorkerThread extends Thread{
	
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Child Thread Doing Work::"+i);
			//Thread.currentThread().yield();
			Thread.yield();
		}
	}

}
