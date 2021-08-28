package com.ashifshadab.withsynchronizationMethod.example3;

public class GenerateTable implements Runnable {

	@Override
	public void run() {
		
		printTable();

	}
	
	synchronized void printTable() {

		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}

}
