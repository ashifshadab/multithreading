package com.ashifshadab.example1;

public class Worker implements Runnable {

	private ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>();

	@Override
	public void run() {

		int value = (int) (Math.random() * 50D);

		System.out.println(Thread.currentThread().getName() + " set Value at ThreadLocal is :: " + value);

		threadLocal.set(value);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		System.out.println(Thread.currentThread().getName() +" Fetching Value form ThreadLocal :: "+threadLocal.get());
	}

}
