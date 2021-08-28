package com.ashifshadab.withsynchronizationMethod.example6;

public class Printer {
	
	public synchronized void print(String name) {
		
		for(int i=0; i<5; i++) {
			
			try {
				
				Thread.sleep(2000);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("HI "+name);
			
		}
		
	}

}
