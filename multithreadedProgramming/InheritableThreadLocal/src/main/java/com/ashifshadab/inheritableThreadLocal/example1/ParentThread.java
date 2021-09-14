package com.ashifshadab.inheritableThreadLocal.example1;

public class ParentThread extends Thread {

	// anonymous inner class for overriding childValue method.
	public static InheritableThreadLocal inheritableThreadLocal = new InheritableThreadLocal() {
		/*public Object childValue(Object parentValue) {
			return "child data";
		}*/
	};

	public void run() {
		// setting the new value
		inheritableThreadLocal.set("parent data");
		// parent data
		System.out.println("Parent Thread Value :" + inheritableThreadLocal.get());

		ChildThread childThread = new ChildThread();
		childThread.start();
	}

}
