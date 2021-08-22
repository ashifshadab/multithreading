package com.ashifshadab.example2;

public class CardPrintingThread extends Thread {

	String name;

	WeddingVenuThread weddingVenuThread;

	public CardPrintingThread(String name, WeddingVenuThread wedingVenuThread) {
		super();
		this.name = name;
		this.weddingVenuThread = wedingVenuThread;
	}

	public void run() {

		try {

			weddingVenuThread.join();

		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}

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
