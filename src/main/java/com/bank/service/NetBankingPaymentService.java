package com.bank.service;

import org.springframework.stereotype.Service;

@Service
public class NetBankingPaymentService extends PaymentService {

    @Override
    public String processPayment(double amount) {
        return "Net Banking Payment Success : " + amount;
    }
}