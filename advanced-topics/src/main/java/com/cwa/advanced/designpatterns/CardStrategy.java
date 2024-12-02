package com.cwa.advanced.designpatterns;

public class CardStrategy implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println(amount + " paid by card.");
    }
}
