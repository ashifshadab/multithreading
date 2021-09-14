package com.ashifshadab.threadLocal.problem;

public class ChildThread extends Thread {

	public void run() {

		// returns the ThreadLocal value associated with current thread
		System.out.println("Child Thread Value :" + ParentThread.threadLocal.get());
		/*
		 * null (parent thread variable thread local value is not available to child
		 * thread )
		 */

	}

}
