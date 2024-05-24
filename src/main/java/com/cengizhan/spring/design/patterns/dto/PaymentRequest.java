package com.cengizhan.spring.design.patterns.dto;

public record PaymentRequest(
        String orderId,
        Double amount,
        String paymentType
) {
}
