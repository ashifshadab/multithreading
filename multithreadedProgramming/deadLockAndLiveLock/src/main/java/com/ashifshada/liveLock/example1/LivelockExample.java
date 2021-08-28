package com.ashifshada.liveLock.example1;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LivelockExample {

	private Lock lock1 = new ReentrantLock(true);
	private Lock lock2 = new ReentrantLock(true);

	public static void main(String[] args) {

		LivelockExample livelock = new LivelockExample();

		Thread t1 = new Thread() {

			public void run() {
				livelock.operation1();
			}
		};

		Thread t2 = new Thread() {

			public void run() {
				livelock.operation2();
			}
		};

		t1.start();
		t2.start();

	}

	public void operation1() {

		while (true) {

			try {

				lock1.tryLock(2000, TimeUnit.MILLISECONDS);

			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}

			System.out.println("lock1 acquired, trying to acquire lock2.");

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			if (lock2.tryLock()) {

				System.out.println("lock2 acquired.");

			} else {
				System.out.println("cannot acquire lock2, releasing lock1.");
				lock1.unlock();
				continue;
			}

			System.out.println("executing first operation.");
			break;
		}
		lock2.unlock();
		lock1.unlock();

	}

	public void operation2() {
		while (true) {

			try {

				lock2.tryLock(2000, TimeUnit.MILLISECONDS);

			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}

			System.out.println("lock2 acquired, trying to acquire lock1.");

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			if (lock1.tryLock()) {
				System.out.println("lock1 acquired.");
			} else {
				System.out.println("cannot acquire lock1, releasing lock2.");
				lock2.unlock();
				continue;
			}

			System.out.println("executing second operation.");
			break;
		}
		lock1.unlock();
		lock2.unlock();
	}

}
