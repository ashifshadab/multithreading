package com.ashifshadab.incorrectImplementationOf.producerConsumer;

public class TestProducerConsumer {

	public static void main(String[] args) {

		Queue queue = new Queue();
		
		new Thread(new Producer(queue, "PRODUCER")).start();
		
		new Thread (new Consumer(queue, "Consumer")).start();

	}

}
