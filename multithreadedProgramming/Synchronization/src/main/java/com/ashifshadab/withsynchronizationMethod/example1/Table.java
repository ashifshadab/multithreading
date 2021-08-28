package com.ashifshadab.withsynchronizationMethod.example1;

public class Table implements Runnable {

	String name;

	int number;

	public Table(String name, int number) {
		super();
		this.name = name;
		this.number = number;
	}

	@Override
	public void run() {

		printTable();

	}

	synchronized void printTable() {
		
		for (int i = 1; i <= 5; i++) {

			System.out.println(name + " Printing Table of "+number +"*"+i+"::"+ number * i);
			
			//System.out.println(Thread.currentThread().getName()+"::::"+i);

			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

}
