package com.ashifshadab.basicExample1;

public class Test {

	public static void main(String[] args) {

		new Thread(new NewThreadByImplemntingRunnable()).start();

		new Thread(new NewThreadByImplemntingRunnable()).start();
	}

}
