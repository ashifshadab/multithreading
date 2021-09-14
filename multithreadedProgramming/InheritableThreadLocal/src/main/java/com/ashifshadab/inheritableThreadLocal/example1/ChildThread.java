package com.ashifshadab.inheritableThreadLocal.example1;

public class ChildThread extends Thread {

	public void run() {
		// child data
		System.out.println("Child Thread Value :" + ParentThread.inheritableThreadLocal.get());
	}
}
