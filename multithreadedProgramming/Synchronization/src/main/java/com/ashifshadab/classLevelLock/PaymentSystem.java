package com.ashifshadab.classLevelLock;

public class PaymentSystem {

	public static synchronized void doPayment(String paymentMode) {

		String threadName = Thread.currentThread().getName();

		System.out.println("Payment Process Start at " + java.time.LocalTime.now() + " by " + threadName);

		System.out.println(threadName + " Hold Lock " + Thread.currentThread().holdsLock(PaymentSystem.class));

		for (int i = 0; i < 5; i++) {

			System.out.println(threadName + " doing Payment with " + paymentMode);

			try {

				Thread.sleep(2000);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Payment Process End at " + java.time.LocalTime.now() + " by " + threadName);
	}

}
