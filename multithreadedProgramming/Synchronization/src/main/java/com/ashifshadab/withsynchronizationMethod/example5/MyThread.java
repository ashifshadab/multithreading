package com.ashifshadab.withsynchronizationMethod.example5;

public class MyThread extends Thread {
	
	Display display;
	
	String name;

	public MyThread(Display display, String name) {
		super();
		this.display = display;
		this.name = name;
	}
	
	public void run() {
		display.wish(name);
	}

}
