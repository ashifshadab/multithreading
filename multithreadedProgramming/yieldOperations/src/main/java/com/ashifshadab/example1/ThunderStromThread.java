package com.ashifshadab.example1;

public class ThunderStromThread extends Thread {

	String name;

	public ThunderStromThread(String name) {
		super();
		this.name = name;
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(name + "Doing Work::"+i);
			//Thread.currentThread().yield();
		}
	}
}
