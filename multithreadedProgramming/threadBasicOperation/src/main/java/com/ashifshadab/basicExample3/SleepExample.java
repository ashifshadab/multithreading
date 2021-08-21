package com.ashifshadab.basicExample3;

public class SleepExample extends Thread {

	public static void main(String[] args) {

		SleepExample sleepExample1 = new SleepExample();

		SleepExample sleepExample2 = new SleepExample();

		sleepExample1.start();

		sleepExample2.start();
		
		//System.out.println(sleepExample1.getName()+" ::: "+sleepExample1.getState());
		//System.out.println(sleepExample2.getName()+" ::: "+sleepExample2.getState());

	}

	public void run() {

		for (int i = 0; i < 5; i++) {

			String name = Thread.currentThread().getName();

			try {

				Thread.sleep(500);
				
				// thread to sleep for 1000 milliseconds plus 500 nanoseconds
		        //Thread.sleep(1000, 500);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println(name + " Printing ::" + i);

		}
	}
}
