package com.ashifshada.deadLock.example1;

public class TestDeadlock {

	public static void main(String[] args) {

		String lock1 = "FIRST LOCK";
		
		String lock2 = "SECOND LOCK";
		
		new Thread(new FirstThread(lock1, lock2)).start();
		
		new Thread(new SecondThread(lock1, lock2)).start();

	}

}
