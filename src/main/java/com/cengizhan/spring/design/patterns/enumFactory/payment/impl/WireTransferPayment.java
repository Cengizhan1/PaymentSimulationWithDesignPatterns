package com.cengizhan.spring.design.patterns.enumFactory.payment.impl;

import com.cengizhan.spring.design.patterns.enumFactory.payment.Payment;
import org.springframework.stereotype.Service;

@Service
public class WireTransferPayment implements Payment {

    @Override
    public String pay(String orderId, Double amount) {
        return "Payment done with wire transfer in EnumTypeFactoryDesignPattern for orderId: " + orderId + " amount: " + amount;
    }
}
