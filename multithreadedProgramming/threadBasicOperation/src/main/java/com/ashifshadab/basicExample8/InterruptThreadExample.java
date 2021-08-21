package com.ashifshadab.basicExample8;

/**
 * The interrupt() method of thread class is used to interrupt the thread. If
 * any thread is in sleeping or waiting state (i.e. sleep() or wait() is
 * invoked) then using the interrupt() method, we can interrupt the thread
 * execution by throwing InterruptedException.
 ***/
public class InterruptThreadExample extends Thread {

	public static void main(String[] args) {

		InterruptThreadExample interruptThreadExample1 = new InterruptThreadExample();
		InterruptThreadExample interruptThreadExample2 = new InterruptThreadExample();
		InterruptThreadExample interruptThreadExample3 = new InterruptThreadExample();

		interruptThreadExample1.start();
		interruptThreadExample2.start();
		interruptThreadExample3.start();

		interruptThreadExample1.interrupt();

	}

	public void run() {

		String name = Thread.currentThread().getName();

		System.out.println(name + " is in state " + Thread.currentThread().getState());

		for (int i = 0; i < 5; i++) {

			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name + " Printing ::" + i);
		}
	}

}
