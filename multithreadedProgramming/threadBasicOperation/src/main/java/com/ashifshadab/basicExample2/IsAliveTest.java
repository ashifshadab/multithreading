package com.ashifshadab.basicExample2;

/**
 * The isAlive() method of thread class tests if the thread is alive. A thread
 * is considered alive when the start() method of thread class has been called
 * and the thread is not yet dead. This method returns true if the thread is
 * still running and not finished.
 **/
public class IsAliveTest extends Thread {

	public static void main(String[] args) {

		IsAliveTest isAliveTest = new IsAliveTest();

		System.out.println("Before starting thread isAlive: " + isAliveTest.isAlive());

		isAliveTest.start();

		System.out.println("After starting thread isAlive: " + isAliveTest.isAlive());
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			String name = Thread.currentThread().getName();
			System.out.println(name + " Printing ::" + i);
			System.out.println(name + " isAlive()" + Thread.currentThread().isAlive());
		}
	}

}
