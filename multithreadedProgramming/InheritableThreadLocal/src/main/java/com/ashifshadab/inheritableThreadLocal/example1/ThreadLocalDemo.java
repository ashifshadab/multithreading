package com.ashifshadab.inheritableThreadLocal.example1;

public class ThreadLocalDemo {

	public static void main(String[] args) {

		ParentThread parentThread = new ParentThread();
		
		parentThread.start();

	}

}
