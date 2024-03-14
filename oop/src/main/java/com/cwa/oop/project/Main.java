package com.cwa.oop.project;

public class Main {

    // Create a bank account system
    // 1. An account has a number, owner and balance where you can make a deposit or withdraw money
    // 2. There are two types of account: current and savings accounts
    // 3. A current account has an overdraft limit
    // 4. A saving account has an interest rate that can be calculated giving the number of year
    // with formula A = P * (1 + r)**t

    public static void main(String[] args) {
        CurrentAccount currentAccount = new CurrentAccount();
        currentAccount.setOwner("John");
        currentAccount.setAccountNumber("TG564");
        currentAccount.setBalance(2500);
        currentAccount.withdraw(2000);
        currentAccount.setOverdraftLimit(-100);
        currentAccount.displayDetails();

        SavingsAccount savingsAccount = new SavingsAccount(0.03);
        savingsAccount.setBalance(10000);
        savingsAccount.setOwner("Jane");
        savingsAccount.setAccountNumber("HY678");

        savingsAccount.deposit(500);

        double balanceInTenYears = savingsAccount.calculateInterest(1);
        savingsAccount.setBalance(balanceInTenYears);

        savingsAccount.displayDetails();
    }
}
