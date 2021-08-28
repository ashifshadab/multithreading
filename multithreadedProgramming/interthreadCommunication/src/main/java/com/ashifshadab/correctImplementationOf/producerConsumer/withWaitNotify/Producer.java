package com.ashifshadab.correctImplementationOf.producerConsumer.withWaitNotify;

public class Producer implements Runnable {

	Queue queue;

	String name;

	public Producer(Queue queue, String name) {
		super();
		this.queue = queue;
		this.name = name;
	}

	@Override
	public void run() {

		int number = 0;

		while (true) {
			queue.put(number++);
		}

	}

}
