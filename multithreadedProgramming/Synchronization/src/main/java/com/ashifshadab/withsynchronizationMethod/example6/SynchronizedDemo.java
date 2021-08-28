package com.ashifshadab.withsynchronizationMethod.example6;

public class SynchronizedDemo {

	public static void main(String[] args) {

		Printer printer = new Printer();
		
		new Thread(new Worker(printer, "Shyam")).start();
		
		new Thread(new Worker(printer, "Mohan")).start();

	}

}
