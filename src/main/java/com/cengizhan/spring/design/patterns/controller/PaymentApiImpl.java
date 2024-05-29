package com.cengizhan.spring.design.patterns.controller;

import com.cengizhan.spring.design.patterns.api.PaymentApi;
import com.cengizhan.spring.design.patterns.enumFactory.PaymentEnumType;
import com.cengizhan.spring.design.patterns.model.PaymentRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentApiImpl implements PaymentApi {

    @Override
    public ResponseEntity<String> pay(PaymentRequest paymentRequest) {
        return ResponseEntity.ok(PaymentEnumType.getPaymentType(paymentRequest.getPaymentType())
                .getPayment()
                .pay(paymentRequest.getOrderId(), paymentRequest.getAmount().doubleValue()));
    }
}