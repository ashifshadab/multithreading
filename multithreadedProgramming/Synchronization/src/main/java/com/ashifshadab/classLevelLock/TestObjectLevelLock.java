package com.ashifshadab.classLevelLock;

public class TestObjectLevelLock {

	public static void main(String[] args) {

		PaymentSystem paymentSystem = new PaymentSystem();
		
		PaymentSystem paymentSystem1 = new PaymentSystem();
		
		
		PaymentThread paymentThread = new PaymentThread(paymentSystem, "NetBanking");

		PaymentThread paymentThread1 = new PaymentThread(paymentSystem1, "Credit Card");
		
		paymentThread.start();
		
		paymentThread1.start();
	}

}
