package com.ashifshadab.example4;

public class TestThreadGroup {

	public static void main(String[] args) {

		ThreadGroup threadGroup1 = new ThreadGroup("FIRST GROUP");

		Thread thread1 = new Thread(threadGroup1, "THREAD1");

		ThreadGroup threadGroup2 = new ThreadGroup(threadGroup1, "CHILD GROUP");

		Thread thread2 = new Thread(threadGroup2, "THREAD2");

		System.out.println("My name is :: " + threadGroup1.getName() + " and my group name is :: "
				+ threadGroup1.getParent().getName());

		System.out.println(
				"My name is :: " + thread1.getName() + " and my group name is :: " + thread1.getThreadGroup().getName());

		System.out.println("My name is :: " + threadGroup2.getName() + " and my group name is :: "
				+ threadGroup2.getParent().getName());

		System.out.println(
				"My name is :: " + thread2.getName() + " and my group name is :: " + thread2.getThreadGroup().getName());

	}

}
