package com.ashifshadab.problemwithoutsynchronization;

public class MyThread1 extends Thread {

	GenerateTable generateTable;

	public MyThread1(GenerateTable generateTable) {
		super();
		this.generateTable = generateTable;
	}

	public void run() {
		generateTable.printTable(5);
	}
}
