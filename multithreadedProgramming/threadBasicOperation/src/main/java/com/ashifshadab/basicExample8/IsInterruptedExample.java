package com.ashifshadab.basicExample8;

public class IsInterruptedExample extends Thread {

	public static void main(String[] args) {

		IsInterruptedExample isInterruptedExample1 = new IsInterruptedExample();
		IsInterruptedExample isInterruptedExample2 = new IsInterruptedExample();
		IsInterruptedExample isInterruptedExample3 = new IsInterruptedExample();

		isInterruptedExample1.start();
		isInterruptedExample2.start();
		isInterruptedExample3.start();

		System.out.println(
				isInterruptedExample1.getName() + " is thread interrupted..: " + isInterruptedExample1.isInterrupted());
		System.out.println(
				isInterruptedExample2.getName() + " is thread interrupted..: " + isInterruptedExample2.isInterrupted());

		isInterruptedExample1.interrupt();

		System.out.println(
				isInterruptedExample1.getName() + " is thread interrupted..: " + isInterruptedExample1.isInterrupted());
		System.out.println(
				isInterruptedExample2.getName() + " is thread interrupted..: " + isInterruptedExample2.isInterrupted());

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
