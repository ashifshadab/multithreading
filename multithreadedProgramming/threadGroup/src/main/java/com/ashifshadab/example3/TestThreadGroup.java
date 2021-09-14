package com.ashifshadab.example3;

public class TestThreadGroup {

	public static void main(String[] args) {

		ThreadGroup threadGroup = new ThreadGroup("First Group");
		
		Thread thread1 = new Thread(threadGroup, "Thread1");
		
		Thread thread2 = new Thread(threadGroup, "Thread2");
		
		System.out.println("The Priority of threadGroup is :: "+threadGroup.getMaxPriority());
		
		System.out.println("The Priority of Thread1 is :: "+thread1.getPriority());
		
		System.out.println("The Priority of Thread2 is :: "+thread2.getPriority());
		
		threadGroup.setMaxPriority(3);
		
		System.out.println("The Priority of threadGroup after setting is :: "+threadGroup.getMaxPriority());
		
		Thread thread3 = new Thread(threadGroup, "Thread3");
		
		Thread thread4 = new Thread(threadGroup, "Thread4");
		
		System.out.println("The Priority of Thread3 is :: "+thread3.getPriority());
		
		System.out.println("The Priority of Thread4 is :: "+thread4.getPriority());
		
		System.out.println("The Priority of Thread1 after resetting of thread group prioritty is :: "+thread1.getPriority());
		
		System.out.println("The Priority of Thread2 after resetting of thread group prioritty is :: "+thread2.getPriority());
	}

}
