package com.cwa.exceptions.domain;

import com.cwa.exceptions.InsufficientBalanceException;

public class Account {

    private String owner;
    private double balance;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        if (balance > amount)
            balance -= amount;
        else throw new InsufficientBalanceException("Your balance is too low for this transaction.");
    }

    public void displayDetails() {
        System.out.println("Owner: " + owner);
        System.out.println("Balance: " + balance);
    }
}
