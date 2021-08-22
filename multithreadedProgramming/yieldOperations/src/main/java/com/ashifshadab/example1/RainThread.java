package com.ashifshadab.example1;

public class RainThread extends Thread {

	String name;

	public RainThread(String name) {
		super();
		this.name = name;
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(name + "Doing Work::"+i);
			//Thread.currentThread().yield();
			Thread.yield();
		}
	}
}
