package com.cwa.advanced.designpatterns;

public class PayPalStrategy implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println(amount + " paid via PayPal.");
    }
}
