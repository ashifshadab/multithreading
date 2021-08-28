package com.ashifshadab.withoutVolatile;

public class TestCountValue {

	public static void main(String[] args) {

		Counter counter = new Counter();
		
		CounterThread counterThread = new CounterThread(counter);
		
		CounterThread counterThread1 = new CounterThread(counter);
		
		CounterThread counterThread2 = new CounterThread(counter);
		
		counterThread.start();
		
		counterThread1.start();
		
		counterThread2.start();

	}

}
