package com.bank.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bank.service.CreditCardPaymentService;
import com.bank.service.NetBankingPaymentService;
import com.bank.service.PaymentService;
import com.bank.service.UpiPaymentService;

@Component
public class PaymentFactory {

@Autowired
private UpiPaymentService upiPaymentService;

@Autowired
private CreditCardPaymentService creditCardPaymentService;

@Autowired
private NetBankingPaymentService netBankingPaymentService;

    public PaymentService getPaymentService(String type) {

        switch (type.toUpperCase()) {

            case "UPI":
                return upiPaymentService;

            case "CARD":
                return creditCardPaymentService;

            case "NETBANKING":
                return netBankingPaymentService;

            default:
                throw new RuntimeException("Invalid Payment Type");
        }
    }


}
