package com.ashifshadab.basicExample7;

/**
 * The suspend() method of thread class puts the thread from running to waiting
 * state. This method is used if you want to stop the thread execution and start
 * it again when a certain event occurs. This method allows a thread to
 * temporarily cease execution. The suspended thread can be resumed using the
 * resume() method.
 **/
public class SuspendedExample extends Thread {

	public static void main(String[] args) {

		SuspendedExample suspendedExample1 = new SuspendedExample();
		SuspendedExample suspendedExample2 = new SuspendedExample();
		SuspendedExample suspendedExample3 = new SuspendedExample();

		suspendedExample1.start();
		suspendedExample2.start();

		suspendedExample2.suspend();

		suspendedExample3.start();

		// suspendedExample2.resume();
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
