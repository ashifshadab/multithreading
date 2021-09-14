package com.ashifshadab.threadLocal.problem;

public class ParentThread extends Thread {
	
	public static ThreadLocal threadLocal = new ThreadLocal();
	
	public void run() {
		
		// setting the new value
        threadLocal.set("parent data");
  
        // returns the ThreadLocal value associated with current thread
        System.out.println("Parent  Thread Value :" + threadLocal.get());
  
        ChildThread gfg_ct = new ChildThread();
        gfg_ct.start();
		
	}

}
