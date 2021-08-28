package com.ashifshadab.problemwithoutsynchronization;

public class GenerateTable {

	void printTable(int number) {

		for (int i = 1; i <= 5; i++) {
			System.out.println("Table of " + number + " :: " + number * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}

}
