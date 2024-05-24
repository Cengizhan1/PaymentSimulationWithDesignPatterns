package com.cengizhan.spring.design.patterns.strategy;

public interface PaymentStrategy {

    String pay(String orderId, Double amount, String paymentType);
}
