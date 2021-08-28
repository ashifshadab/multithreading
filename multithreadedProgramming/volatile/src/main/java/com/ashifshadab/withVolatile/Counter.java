package com.ashifshadab.withVolatile;

public class Counter {

	volatile int countValue = 0;

	public int getCount() {

		return countValue;
	}

	public void increaseCount() {

		countValue=countValue+1;
	}
}
