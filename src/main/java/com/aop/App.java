package com.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.services.PaymentService;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/aop/config.xml");
    
        PaymentService paymentObject = context.getBean("payment", PaymentService.class);
    
        paymentObject.MakePayment(294);
    }
}
