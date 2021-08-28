package com.ashifshadab.example1;

public class Account {

	int accountBalance = 100;

	synchronized void withdraw(int withdrawAmount) {

		System.out.println("Going to Withdraw Amount");

		if (this.accountBalance < withdrawAmount) {

			System.out.println("Less Balance at Account, Please wait for Deposit");

			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		} 
		
		this.accountBalance = this.accountBalance - withdrawAmount;
		System.out.println("Withdraw Completed");
	}
	
	synchronized void deposit(int depositAmount) {
		
		System.out.println("Going to Deposit Amount");
		
		this.accountBalance = this.accountBalance + depositAmount;
		
		System.out.println("Deposit Completed");
		
		notify();
	}

}
