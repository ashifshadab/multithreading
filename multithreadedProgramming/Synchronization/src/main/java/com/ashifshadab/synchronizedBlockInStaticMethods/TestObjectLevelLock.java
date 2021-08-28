package com.ashifshadab.synchronizedBlockInStaticMethods;

public class TestObjectLevelLock {

	public static void main(String[] args) {

		PaymentSystem paymentSystem = new PaymentSystem();
		
		
		PaymentThread paymentThread = new PaymentThread(paymentSystem, "NetBanking");

		PaymentThread paymentThread1 = new PaymentThread(paymentSystem, "Credit Card");
		
		paymentThread.start();
		
		paymentThread1.start();
	}

}
