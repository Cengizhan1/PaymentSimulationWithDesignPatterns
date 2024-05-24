package com.cengizhan.spring.design.patterns.controller;

import com.cengizhan.spring.design.patterns.dto.PaymentRequest;
import com.cengizhan.spring.design.patterns.enumFactory.PaymentEnumType;
import com.cengizhan.spring.design.patterns.factory.PaymentFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v2/payment")
public class PaymentEnumController {

    @PostMapping
    public ResponseEntity<String> pay(@RequestBody PaymentRequest paymentRequest) {
        return ResponseEntity.ok(PaymentEnumType.getPaymentType(paymentRequest.paymentType())
                .getPayment().pay(paymentRequest.orderId(), paymentRequest.amount()));
    }
}
