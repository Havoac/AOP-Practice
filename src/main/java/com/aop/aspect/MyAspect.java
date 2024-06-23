package com.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	@Before("execution(* com.aop.services.PaymentServiceImpl.MakePayment(..))")
	public void PrintBefore() {
		System.out.println("Payment Started ...");

	}
	
	@After("execution(* com.aop.services.PaymentServiceImpl.MakePayment(..))")
	public void AfterBefore() {
		System.out.println("Payment done ...");

	}
}
