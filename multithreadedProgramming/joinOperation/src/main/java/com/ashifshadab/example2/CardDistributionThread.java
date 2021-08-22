package com.ashifshadab.example2;

public class CardDistributionThread extends Thread {

	String name;

	CardPrintingThread cardPrintingThread;

	public CardDistributionThread(String name, CardPrintingThread cardPrintingThread) {
		super();
		this.name = name;
		this.cardPrintingThread = cardPrintingThread;
	}

	public void run() {

		try {

			cardPrintingThread.join();

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
