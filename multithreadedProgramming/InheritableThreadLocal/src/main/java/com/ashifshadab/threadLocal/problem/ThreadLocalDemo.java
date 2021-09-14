package com.ashifshadab.threadLocal.problem;

public class ThreadLocalDemo {

	public static void main(String[] args) {

		ParentThread parentThread = new ParentThread();
		
		parentThread.start();

	}

}
