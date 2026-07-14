package com.bank.service;

public abstract class PaymentService {

public abstract String processPayment(double amount);

public void auditlog() {
    // Log the payment processing details for auditing purposes
    System.out.println("Payment Audit Created.");    

} 
}

