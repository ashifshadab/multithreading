package com.ashifshadab.objectLevelLock;

public class PaymentThread extends Thread {
	
	PaymentSystem paymentSystem;
	
	String paymentMode;
	public PaymentThread(PaymentSystem paymentSystem,String paymentMode) {
		super();
		this.paymentSystem = paymentSystem;
		this.paymentMode =paymentMode;
	}
	
	public void run() {
		System.out.println(Thread.currentThread().getName()+" Hold Lock "+Thread.currentThread().holdsLock(this));
		paymentSystem.doPayment(paymentMode);
	}

}
