package com.ashifshadab.correctImplementationOf.producerConsumer.withWaitNotify;

public class Consumer implements Runnable {
	
	Queue queue;

	String name;
	
	

	public Consumer(Queue queue, String name) {
		super();
		this.queue = queue;
		this.name = name;
	}



	@Override
	public void run() {

		while (true) {
			queue.get();
		}

	}

}
