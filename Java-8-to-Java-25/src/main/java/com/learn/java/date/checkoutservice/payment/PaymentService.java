package com.learn.java.date.checkoutservice.payment;

import com.learn.java.date.checkoutservice.domain.OrderDetails;
import com.learn.java.date.checkoutservice.domain.PaymentResponse;

public class PaymentService {

    public PaymentResponse makePayment(OrderDetails orderDetails) {

        //implement a payment gateway that can handle the different kinds of payment.
        var paymentGateway = PaymentFactory.paymentGateway(orderDetails.card().cardType());
        // this point we get payment with Credit, debit or rewards
        
        return paymentGateway.makePayment(orderDetails.card(), orderDetails.finalAmount());
        //return PaymentResponse.SUCCESS;
    }
}
