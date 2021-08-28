package com.ashifshadab.withsynchronizationMethod.example4;

public class Test {

	public static void main(String[] args) {

		MyCounter myCounter = new MyCounter();
		
		Thread threadA = new CounterThread(myCounter);
		
		Thread threadB = new CounterThread(myCounter);
		
		threadA.start();
		
		threadB.start();

	}

}
