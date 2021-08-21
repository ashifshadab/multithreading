package com.ashifshadab.basicExample8;

/**
 * If the thread is not in the sleeping or waiting state then calling the
 * interrupt() method performs a normal behavior and doesn't interrupt the
 * thread but sets the interrupt flag to true.
 **/
public class InterruptThreadExample2 extends Thread {

	public static void main(String[] args) {

		InterruptThreadExample2 interruptThreadExample1 = new InterruptThreadExample2();
		InterruptThreadExample2 interruptThreadExample2 = new InterruptThreadExample2();
		InterruptThreadExample2 interruptThreadExample3 = new InterruptThreadExample2();

		interruptThreadExample1.start();
		interruptThreadExample2.start();
		interruptThreadExample3.start();

		interruptThreadExample1.interrupt();

	}

	public void run() {

		String name = Thread.currentThread().getName();

		System.out.println(name + " is in state " + Thread.currentThread().getState());

		for (int i = 0; i < 5; i++) {

			System.out.println(name + " Printing ::" + i);
		}
	}

}
