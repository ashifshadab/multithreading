package com.ashifshadab.exceptionAtSynchronized;

public class Test {

	public static void main(String[] args) {

		Printer printer = new Printer();
		
		Thread thread1 = new Thread(new WorkerThread(printer),"Raj");
		
		Thread thread2 = new Thread(new WorkerThread(printer),"Mohan");
		
		Thread thread3 = new Thread(new WorkerThread(printer),"Shyam");
		
		thread1.start();
		
		thread2.start();
		
		thread3.start();

	}

}
