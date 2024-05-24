package com.cengizhan.spring.design.patterns.factory.impl;

import com.cengizhan.spring.design.patterns.dto.PaymentRequest;
import com.cengizhan.spring.design.patterns.factory.PaymentFactory;
import com.cengizhan.spring.design.patterns.strategy.PaymentStrategy;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class PaymentFactoryImpl implements PaymentFactory {

    private final Map<String, PaymentStrategy> paymentStrategyMap;

    public PaymentFactoryImpl(Map<String, PaymentStrategy> paymentStrategyMap) {
        this.paymentStrategyMap = paymentStrategyMap;
    }

    public PaymentStrategy getPaymentStrategy(String paymentType) {
        PaymentStrategy paymentStrategy = paymentStrategyMap.get(paymentType);
        if (paymentStrategy == null) {
            throw new IllegalArgumentException("Payment type not supported. Payment type: "+paymentType);
        }
        return paymentStrategy;
    }

    @Override
    public String execute(PaymentRequest paymentRequest) {
        PaymentStrategy paymentStrategy = getPaymentStrategy(paymentRequest.paymentType());
        return paymentStrategy.pay(paymentRequest.orderId(), paymentRequest.amount(), paymentRequest.paymentType());
    }
}
