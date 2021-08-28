package com.ashifshadab.withsynchronizationMethod.example4;

public class CounterThread extends Thread {

	MyCounter myCounter = null;

	public CounterThread(MyCounter myCounter) {
		super();
		this.myCounter = myCounter;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			myCounter.add(i);
		}
		
		System.out.println(myCounter.getCount());
	}

}
