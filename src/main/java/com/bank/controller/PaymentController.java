package com.bank.controller;

import com.bank.dto.PaymentRequest;
import com.bank.factory.PaymentFactory;
import com.bank.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentFactory paymentFactory;

    @PostMapping
    public String makePayment(@RequestBody PaymentRequest request) {

        System.out.println("Payment Type: " + request.getPaymentType());

        PaymentService paymentService =

                paymentFactory.getPaymentService(request.getPaymentType());

                System.out.println("Payment Service: " + paymentService);

        return paymentService.processPayment(request.getAmount());
    }
}