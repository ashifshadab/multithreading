package com.ashifshadab.example1;

public class Test {

	public static void main(String[] args) {

		Worker worker = new Worker();

		Thread thread1 = new Thread(worker);
		
		Thread thread2 = new Thread(worker);
		
		thread1.start();
		
		thread2.start();
	}

}
