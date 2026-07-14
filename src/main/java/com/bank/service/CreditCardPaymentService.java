package com.bank.service;

import org.springframework.stereotype.Service;

@Service
public class CreditCardPaymentService extends PaymentService {

    @Override
    public String processPayment(double amount) {
        System.out.println("Processing Credit Card Payment of amount: " + amount);
        return "Credit Card Payment Success : " + amount;
    }
}