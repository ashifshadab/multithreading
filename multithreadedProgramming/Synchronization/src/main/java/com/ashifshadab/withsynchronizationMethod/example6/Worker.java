package com.ashifshadab.withsynchronizationMethod.example6;

public class Worker implements Runnable {

	Printer printer;

	String name;

	public Worker(Printer printer, String name) {
		super();
		this.printer = printer;
		this.name = name;
	}

	@Override
	public void run() {

		printer.print(name);

	}

}
