package com.ashifshadab.example1;

public class MyThread extends Thread {
	
	public void run() {
		 System.out.println("shut down hook task started..");  
		System.out.println("Hi boos start");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Hi boos end");
		 System.out.println("shut down hook task completed..");  
	}

}
