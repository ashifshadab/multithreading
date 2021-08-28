package com.ashifshadab.withsynchronizationMethod.example3;

public class TestSynchronization {

	public static void main(String[] args) {

		GenerateTable generateTable = new GenerateTable();

		new Thread(generateTable, "ThreadA").start();

		new Thread(generateTable, "ThreadB").start();

	}

}
