package com.learn.java.date.paymentservicetest;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import com.learn.java.date.checkoutservice.domain.Card;
import com.learn.java.date.checkoutservice.domain.CardType;
import com.learn.java.date.checkoutservice.domain.CheckOutStatus;
import com.learn.java.date.checkoutservice.domain.OrderDetails;
import com.learn.java.date.checkoutservice.payment.PaymentService;
import com.learn.java.date.checkoutservice.service.CheckoutService;

public class CheckoutServiceTest {


    PaymentService paymentService = new PaymentService();
    CheckoutService checkoutService = new CheckoutService(paymentService);

    @EnumSource(CardType.class)
    @ParameterizedTest(name = "Checkout for Car Type : {0}")
    void checkout(CardType cardType){
        var orderDetails = orderDetails(cardType);
        var response = checkoutService.checkoutOrder(orderDetails);
        assertEquals(CheckOutStatus.SUCCESS, response);
    }

    // create object orderDetails 
    static OrderDetails orderDetails(CardType cardType) {

        var card = new Card("ABC", "7676709809809809",
                "4567", "09/99", cardType);
        return new OrderDetails("1234", card, 99.0);

    }
}
