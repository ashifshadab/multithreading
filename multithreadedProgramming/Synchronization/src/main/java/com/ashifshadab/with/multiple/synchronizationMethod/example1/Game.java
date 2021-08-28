package com.ashifshadab.with.multiple.synchronizationMethod.example1;

public class Game {

	public void videoGame(String playerName) {

		for (int i = 0; i < 5; i++) {

			try {

				Thread.sleep(2000);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println(playerName + " Playing Video Game :::" + i);
		}
	}

	public synchronized void cricket(String playerName) {

		for (int i = 0; i < 5; i++) {

			try {

				Thread.sleep(2000);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println(playerName + " Playing cricket :::" + i);
		}
	}

	public synchronized void football(String playerName) {

		for (int i = 0; i < 5; i++) {

			try {

				Thread.sleep(2000);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println(playerName + " Playing football :::" + i);
		}
	}

}
