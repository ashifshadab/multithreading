package com.ashifshadab.withoutVolatile;

public class Counter {

	int countValue = 0;

	public int getCount() {

		return countValue;
	}

	public void increaseCount() {

		countValue=countValue+1;
	}
}
