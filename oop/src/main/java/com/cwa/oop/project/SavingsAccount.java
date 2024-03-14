package com.cwa.oop.project;

public class SavingsAccount extends Account implements InterestBearing {

    private double interestRate;

    public SavingsAccount() {}

    public SavingsAccount(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest(int years) {
        return getBalance() * Math.pow((1 + interestRate), years);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Interest Rate: " + interestRate);
    }
}
