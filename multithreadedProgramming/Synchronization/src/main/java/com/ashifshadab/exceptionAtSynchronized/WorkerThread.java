package com.ashifshadab.exceptionAtSynchronized;

public class WorkerThread extends Thread {

	Printer printer;

	public WorkerThread(Printer printer) {
		super();
		this.printer = printer;
	}

	public void run() {
		printer.print();
	}

}
