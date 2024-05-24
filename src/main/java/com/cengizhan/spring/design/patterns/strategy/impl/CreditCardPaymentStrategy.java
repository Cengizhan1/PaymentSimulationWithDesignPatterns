package com.cengizhan.spring.design.patterns.strategy.impl;

import com.cengizhan.spring.design.patterns.strategy.PaymentStrategy;
import org.springframework.stereotype.Service;

@Service("creditCard")
public class CreditCardPaymentStrategy implements PaymentStrategy {

    @Override
    public String pay(String orderId, Double amount, String paymentType) {
        return "Payment done with credit card for orderId: " + orderId + " amount: " + amount + " paymentType: " + paymentType;
    }
}
