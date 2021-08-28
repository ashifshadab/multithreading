package com.ashifshadab.withsynchronizationMethod.example5;

public class Display {

	/*public  void wish(String name) {

		for (int i = 0; i < 5; i++) {

			System.out.print("Good Morning:::");

			try {
				Thread.sleep(2000);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println(name);

		}
	}*/
	
	/*public synchronized void wish(String name) {

		for (int i = 0; i < 5; i++) {

			System.out.print("Good Morning:::");

			try {
				Thread.sleep(2000);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println(name);

		}
	}*/
	
	/*public synchronized void wish(String name) {

		for (int i = 0; i < 5; i++) {

			System.out.print("Good Morning:::");

			try {
				Thread.sleep(2000);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println(name);

		}
	}*/
	
	public static synchronized void wish(String name) {

		for (int i = 0; i < 5; i++) {

			System.out.print("Good Morning:::");

			try {
				Thread.sleep(2000);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println(name);

		}
	}
}
