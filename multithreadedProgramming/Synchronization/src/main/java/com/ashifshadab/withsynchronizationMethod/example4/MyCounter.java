package com.ashifshadab.withsynchronizationMethod.example4;

public class MyCounter {

	private int count = 0;

	public int getCount() {
		return count;
	}

	public synchronized void add(int value) {
		this.count += value;
	}

	public synchronized void subtract(int value) {
		this.count -= value;
	}

}
