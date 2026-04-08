package com.learn.java.date.checkoutservice.payment;

import com.learn.java.date.checkoutservice.domain.Card;
import com.learn.java.date.checkoutservice.domain.PaymentResponse;

public final class DebitCardPayment extends PaymentGateway {
    @Override
    public PaymentResponse makePayment(Card card, double amount) {
        System.out.println("Acquire Debit Card Payment for the amount = " + amount);
        return PaymentResponse.SUCCESS;
    }
}
