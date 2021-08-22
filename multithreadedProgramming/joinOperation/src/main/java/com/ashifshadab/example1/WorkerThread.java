package com.ashifshadab.example1;

public class WorkerThread extends Thread {
	
	public void run() {
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("Child Thread Doing Work::"+i);
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
