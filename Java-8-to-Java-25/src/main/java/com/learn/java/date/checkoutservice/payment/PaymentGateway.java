package com.learn.java.date.checkoutservice.payment;

import com.learn.java.date.checkoutservice.domain.Card;
import com.learn.java.date.checkoutservice.domain.PaymentResponse;

public sealed abstract class PaymentGateway permits DebitCardPayment,
CreditCardPayment, RewardsCardPayment{

    public abstract PaymentResponse makePayment(Card card, double amount);
}
