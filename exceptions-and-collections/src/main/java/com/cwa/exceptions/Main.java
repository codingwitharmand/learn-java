package com.cwa.exceptions;

import com.cwa.exceptions.domain.Account;

public class Main {

    public static void main(String[] args) {
        Account account = new Account();
        account.setOwner("John");
        account.setBalance(1000);
        try {
            account.withdraw(1500);
        } catch (InsufficientBalanceException e) {
            System.err.println(e.getMessage());
        } finally {
            account.displayDetails();
        }
    }
}
