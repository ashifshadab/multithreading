package com.ashifshadab.example1;

public class WithdrawThread extends Thread {

	Account account;

	public WithdrawThread(Account account) {
		super();
		this.account = account;
	}
	
	public void run() {
		account.withdraw(300);
	}
}
