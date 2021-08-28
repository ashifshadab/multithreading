package com.ashifshadab.withsynchronizationMethod.example5;

public class SynchronizedDemo {

	public static void main(String[] args) {

		Display display = new Display();
		
		Display display2 = new Display();
		
		MyThread myThread1 = new MyThread(display, "Dhoni");
		
		MyThread myThread2 = new MyThread(display, "Yuraj");
		
		MyThread myThread3 = new MyThread(display2, "Sachin");
		
		MyThread myThread4 = new MyThread(display, "Kapil");
		
		//myThread1.start();
		
		//myThread2.start();
		
		myThread3.start();
		
		myThread4.start();

	}

}
