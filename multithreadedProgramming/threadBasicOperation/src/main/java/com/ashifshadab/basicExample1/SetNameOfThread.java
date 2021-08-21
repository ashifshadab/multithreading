package com.ashifshadab.basicExample1;

public class SetNameOfThread {

	public static void main(String[] args) {

		Thread thread = Thread.currentThread();
		
		System.out.println("Name of Current thread ::"+thread.getName());
		
		thread.setName("Raj");
		
		
		System.out.println("Name of Current thread after chaning name::"+thread.getName());
	}

}
