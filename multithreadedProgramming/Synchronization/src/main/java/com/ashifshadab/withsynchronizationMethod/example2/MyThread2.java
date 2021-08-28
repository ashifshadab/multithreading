package com.ashifshadab.withsynchronizationMethod.example2;

public class MyThread2 extends Thread {

	GenerateTable generateTable;

	public MyThread2(GenerateTable generateTable) {
		super();
		this.generateTable = generateTable;
	}

	public void run() {
		generateTable.printTable(100);
	}
}
