package com.cwa.exceptions;

public class ThrowingExceptions {

    public static void main(String[] args) {
        try {
            registerUser("Armand", 14);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception occurred. " + e.getMessage());
            throw e;
        }
    }

    static void registerUser(String username, int age) {
        if(age < 18) {
            throw new IllegalArgumentException("Age is under 18");
        } else System.out.println("User registered.");
    }
}
