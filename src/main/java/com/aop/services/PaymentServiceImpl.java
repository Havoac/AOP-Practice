package com.aop.services;

public class PaymentServiceImpl implements PaymentService {
	public void MakePayment(int amount) {
		System.out.println(amount + " Amount debited ...");	
		System.out.println(amount + " Amount credit ...");
	}

}
