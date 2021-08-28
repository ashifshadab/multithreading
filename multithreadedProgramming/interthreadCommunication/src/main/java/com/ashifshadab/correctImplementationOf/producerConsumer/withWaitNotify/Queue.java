package com.ashifshadab.correctImplementationOf.producerConsumer.withWaitNotify;

public class Queue {

	int number;

	boolean flag = false;

	synchronized int get() {

		while (!flag)
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		System.out.println("Got Number :" + number);

		flag = false;

		notify();

		return number;
	}

	synchronized void put(int number) {

		while (flag)
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		this.number = number;

		flag = true;
		System.out.println("Put Number :" + number);

		notify();

	}

}
