package com.ashifshadab.example2;

public class TestThreadGroup {

	public static void main(String[] args) {

		ThreadGroup spartanThreadGroup = new ThreadGroup("SPARTAN");

		Thread spartanThread1 = new Thread(spartanThreadGroup, "ARROW");

		Thread spartanThread2 = new Thread(spartanThreadGroup, "SWORD");

		System.out.println(spartanThread1.getThreadGroup().getName());

		System.out.println(spartanThread2.getThreadGroup().getName());

		ThreadGroup flowerThreadGroup = new ThreadGroup("FLOWER");

		Thread flowerThread1 = new Thread(flowerThreadGroup, "ARROW");

		Thread flowerThread2 = new Thread(flowerThreadGroup, "SWORD");
		
		System.out.println(flowerThread1.getThreadGroup().getName());

		System.out.println(flowerThread2.getThreadGroup().getName());
	}

}
