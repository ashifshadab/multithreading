package com.ashifshadab.withsynchronizationMethod.example2;

public class TestSynchronization {

	public static void main(String[] args) {

		GenerateTable generateTable = new GenerateTable();
		
		MyThread1 myThread1=new MyThread1(generateTable);
		
		MyThread2 myThread2=new MyThread2(generateTable); 
		
		myThread1.start();  
		
		myThread2.start();

	}

}
