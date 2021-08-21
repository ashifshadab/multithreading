package com.ashifshadab.basicExample6;

/**
 * The yield() method of thread class causes the currently executing thread
 * object to temporarily pause and allow other threads to execute.
 */

public class YieldExample extends Thread {

	public static void main(String[] args) {

		YieldExample yieldExample1 = new YieldExample();

		YieldExample yieldExample2 = new YieldExample();

		yieldExample1.start();

		yieldExample2.start();

		for (int i = 0; i < 3; i++) {
			// Control passes to child thread
			yieldExample1.yield();
			System.out.println(Thread.currentThread().getName() + " in control");
		}

	}

	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " is in state " + Thread.currentThread().getState());
		for (int i = 0; i < 5; i++) {
			System.out.println(name + " Printing ::" + i);
		}
	}

}
