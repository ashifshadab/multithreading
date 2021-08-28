package com.ashifshadab.example1;

public class DoBanking {

	public static void main(String[] args) {

		Account account = new Account();

		new Thread(new WithdrawThread(account)).start();

		new Thread(new DepositThread(account)).start();


	}

}
