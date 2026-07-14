package com.bank.service;

import org.springframework.stereotype.Service;

@Service
public class UpiPaymentService extends PaymentService 
{

    @Override
    public String processPayment(double amount) {
        
       return "UPI Payment Success " +amount;

    }

}
