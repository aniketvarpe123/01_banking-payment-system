package com.bank.dto;

public class PaymentRequest {

    private String PaymentType;
    private double Amount;

    public String getPaymentType() {
        return PaymentType;
    }
    public void setPaymentType(String paymentType) {
        PaymentType = paymentType;
    }
    public double getAmount() {
        return Amount;
    }
    public void setAmount(double amount) {
        Amount = amount;
    }

}
