package com.ashifshadab.example1;

public class DepositThread extends Thread {

	Account account;

	public DepositThread(Account account) {
		super();
		this.account = account;
	}

	public void run() {

		account.deposit(1200);
	}
}
