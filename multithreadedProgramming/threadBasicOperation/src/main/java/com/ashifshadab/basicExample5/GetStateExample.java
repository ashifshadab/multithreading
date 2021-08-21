package com.ashifshadab.basicExample5;

public class GetStateExample extends Thread {

	public static void main(String[] args) {

		GetStateExample getStateExample = new GetStateExample();
		
		System.out.println(getStateExample.getState());
		
		getStateExample.start();
		
		System.out.println(getStateExample.getState());
		
	}
	
	public void run() {
		System.out.println(Thread.currentThread().getState());
		for (int i = 0; i < 5; i++) {
			String name = Thread.currentThread().getName();
			System.out.println(name + " Printing ::" + i);
		}
	}

}
