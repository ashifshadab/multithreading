package com.ashifshadab.basicExample9;

/**
 * The join() method waits for a thread to die. 
 * In other words, it causes the currently running threads to stop executing 
 * until the thread it joins with completes its task.
 * **/
public class ThreadJoinExample extends Thread {

	public static void main(String[] args) {

		ThreadJoinExample threadJoinExample1 = new ThreadJoinExample();
		ThreadJoinExample threadJoinExample2 = new ThreadJoinExample();
		ThreadJoinExample threadJoinExample3 = new ThreadJoinExample();
		ThreadJoinExample threadJoinExample4 = new ThreadJoinExample();

		threadJoinExample1.start();
		threadJoinExample2.start();

		try {

			//threadJoinExample1.join();
			threadJoinExample1.join(1500);  

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		threadJoinExample3.start();
		threadJoinExample4.start();

	}

	public void run() {

		String name = Thread.currentThread().getName();

		System.out.println(name + " is in state " + Thread.currentThread().getState());

		for (int i = 0; i < 5; i++) {

			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name + " Printing ::" + i);
		}
	}
}
