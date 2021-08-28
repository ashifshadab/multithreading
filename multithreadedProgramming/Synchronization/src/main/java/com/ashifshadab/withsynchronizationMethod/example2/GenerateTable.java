package com.ashifshadab.withsynchronizationMethod.example2;

public class GenerateTable {

	synchronized void printTable(int number) {

		for (int i = 1; i <= 5; i++) {
			System.out.println("Table of "+number+" :: "+number * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}

}
