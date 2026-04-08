package com.learn.java.date.checkoutservice.service;

import com.learn.java.date.checkoutservice.domain.CheckOutStatus;
import com.learn.java.date.checkoutservice.domain.OrderDetails;
import com.learn.java.date.checkoutservice.domain.PaymentResponse;
import com.learn.java.date.checkoutservice.payment.PaymentService;

public class CheckoutService {

    private final PaymentService paymentService;

    public CheckoutService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public CheckOutStatus checkoutOrder(OrderDetails orderDetails){

        var paymentResponse = paymentService.makePayment(orderDetails);
        if(paymentResponse.equals(PaymentResponse.SUCCESS)){
            return CheckOutStatus.SUCCESS;
        }
        return CheckOutStatus.FAILURE;

    }
}
