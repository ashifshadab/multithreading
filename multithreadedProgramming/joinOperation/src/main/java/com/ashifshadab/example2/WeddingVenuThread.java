package com.ashifshadab.example2;

public class WeddingVenuThread extends Thread {

	String name;

	public WeddingVenuThread(String name) {
		super();
		this.name = name;
	}

	public void run() {

		for (int i = 0; i < 5; i++) {

			System.out.println(name + " Thread Doing Work::" + i);

			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
