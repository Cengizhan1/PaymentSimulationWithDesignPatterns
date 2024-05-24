package com.cengizhan.spring.design.patterns.factory;

import com.cengizhan.spring.design.patterns.dto.PaymentRequest;

public interface PaymentFactory {

    String execute(PaymentRequest paymentRequest);
}
