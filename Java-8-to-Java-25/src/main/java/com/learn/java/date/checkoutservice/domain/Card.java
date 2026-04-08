package com.learn.java.date.checkoutservice.domain;

public record Card(String name,
                   String cardNumber,
                   String verificationCode,
                   String expiryDate,
                   CardType cardType
) {
}
