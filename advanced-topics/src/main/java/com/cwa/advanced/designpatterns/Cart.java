package com.cwa.advanced.designpatterns;

public class Cart {
    private PaymentStrategy paymentStrategy;

    public Cart(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void pay(double amount) {
        paymentStrategy.pay(amount);
    }
}
