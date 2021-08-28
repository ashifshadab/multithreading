package com.ashifshadab.example1;

public class Test {

	public static void main(String[] args) {

		
		Worker worker = new Worker();
		
		worker.kickStart();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		worker.terminate();

	}

}
