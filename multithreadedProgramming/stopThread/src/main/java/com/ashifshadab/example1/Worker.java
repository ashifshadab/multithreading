package com.ashifshadab.example1;

public class Worker implements Runnable {

	private volatile Thread thread;

	public void kickStart() {

		if (thread == null) {

			thread = new Thread(this);
			thread.start();
		}
	}

	public void terminate() {
		thread = null;
	}

	@Override
	public void run() {

		while (thread == Thread.currentThread()) {

			for (int i = 0; i < 5; i++) {
				System.out.println(thread.getName() + " Printing :::" + i);
			}

		}

	}

}
