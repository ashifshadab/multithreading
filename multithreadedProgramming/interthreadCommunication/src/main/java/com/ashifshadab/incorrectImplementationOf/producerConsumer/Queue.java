package com.ashifshadab.incorrectImplementationOf.producerConsumer;

public class Queue {

	int number;

	synchronized int get() {

		System.out.println("Got Number :" + number);

		return number;

	}

	synchronized void put(int number) {

		this.number = number;

		System.out.println("Put Number :" + number);
	}
}
