package com.ashifshadab.basicExample4;

public class ThreadPriority extends Thread{

	public static void main(String[] args) {

		ThreadPriority threadPriority = new ThreadPriority();
		
		ThreadPriority threadPriority1 = new ThreadPriority();
		
		//threadPriority.setPriority(MAX_PRIORITY); //MAX_PRIORITY=10
		//threadPriority.setPriority(MIN_PRIORITY); //MIN_PRIORITY= 1
		//threadPriority.setPriority(NORM_PRIORITY); //NORM_PRIORITY=5
		
		System.out.println(threadPriority.getName()+" Priority is :: "+threadPriority.getPriority());
		
		System.out.println(threadPriority1.getName()+" Priority is :: "+threadPriority1.getPriority());
		
		threadPriority1.start();
		
		threadPriority.start();
	}

	public void run() {
		
		for (int i = 0; i < 5; i++) {
			String name = Thread.currentThread().getName();
			System.out.println(name + " Printing ::" + i);
			
		}
	}
}
