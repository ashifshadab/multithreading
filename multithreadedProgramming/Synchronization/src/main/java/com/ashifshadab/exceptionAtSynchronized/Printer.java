package com.ashifshadab.exceptionAtSynchronized;

public class Printer {
	
	public synchronized void print() {
		
		System.out.println(Thread.currentThread().getName()+" Got chance to print");
		
		/*try {
			Thread.currentThread().sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		
		for(int i=0; i<5; i++) {
			System.out.println(Thread.currentThread().getName()+" printing "+i);
		}
		
		System.out.println(Thread.currentThread().getName()+" has lock ::"+Thread.currentThread().holdsLock(this));
		
		System.out.println(Thread.currentThread().getName()+" Going to generate Exception");
		
		int value =10/0;
		
		System.out.println("This will not print");
	}

}
