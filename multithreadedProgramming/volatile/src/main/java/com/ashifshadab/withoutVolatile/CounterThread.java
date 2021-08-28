package com.ashifshadab.withoutVolatile;

public class CounterThread extends Thread {

	Counter counter;

	public CounterThread(Counter counter) {
		super();
		this.counter = counter;
	}
	
	public void run() {
		
		synchronized (this) {
		System.out.println(Thread.currentThread().getName()+" Before Incrementing Old Value "+ counter.getCount());
		
		System.out.println(Thread.currentThread().getName()+" Going To increment count");
		
		counter.increaseCount();
		
		System.out.println(Thread.currentThread().getName()+" After Incrementing New Value "+ counter.getCount());
		}
		
	}
}
