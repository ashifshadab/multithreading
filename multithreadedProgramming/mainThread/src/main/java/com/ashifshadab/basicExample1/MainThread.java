package com.ashifshadab.basicExample1;

public class MainThread {

	public static void main(String[] args) {

		Thread thread = Thread.currentThread();
		
		System.out.println("Name of Current Thread ::"+thread.getName());

	}

}
