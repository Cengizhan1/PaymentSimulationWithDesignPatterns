package com.cengizhan.spring.design.patterns.controller;

import com.cengizhan.spring.design.patterns.dto.PaymentRequest;
import com.cengizhan.spring.design.patterns.factory.PaymentFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/payment")
public class PaymentController {

    private final PaymentFactory paymentFactory;

    public PaymentController(PaymentFactory paymentFactory) {
        this.paymentFactory = paymentFactory;
    }

    @PostMapping
    public ResponseEntity<String> pay(@RequestBody PaymentRequest paymentRequest) {
        return ResponseEntity.ok(paymentFactory.execute(paymentRequest));
    }
}
