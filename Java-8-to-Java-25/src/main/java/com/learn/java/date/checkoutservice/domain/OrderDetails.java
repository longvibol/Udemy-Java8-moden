package com.learn.java.date.checkoutservice.domain;

public record OrderDetails(String orderId,
                           Card card,
                           double finalAmount) {
}
