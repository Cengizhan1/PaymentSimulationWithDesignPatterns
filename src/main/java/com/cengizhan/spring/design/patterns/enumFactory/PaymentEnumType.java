package com.cengizhan.spring.design.patterns.enumFactory;

import com.cengizhan.spring.design.patterns.enumFactory.payment.Payment;
import com.cengizhan.spring.design.patterns.enumFactory.payment.impl.CreditCardPayment;
import com.cengizhan.spring.design.patterns.enumFactory.payment.impl.WireTransferPayment;

public enum PaymentEnumType {

    CREDIT_CARD("creditCard", new CreditCardPayment()),
    WIRE_TRANSFER("wireTransfer", new WireTransferPayment());

    private final String value;
    private final Payment payment;

    PaymentEnumType(String value, Payment payment) {
        this.payment = payment;
        this.value = value;
    }

    public Payment getPayment() {
        return payment;
    }

    public String getValue() {
        return value;
    }

    public static PaymentEnumType getPaymentType(String name) {
        for (PaymentEnumType paymentType : PaymentEnumType.values()) {
            if (paymentType.getValue().equals(name)) {
                return paymentType;
            }
        }
        throw new IllegalArgumentException("Payment type not supported. Payment type: " + name);
    }
}
