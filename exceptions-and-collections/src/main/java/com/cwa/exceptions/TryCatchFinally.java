package com.cwa.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Understand try...catch...finally
 */
public class TryCatchFinally {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        try {
            int number = scanner.nextInt();
            double result = 100 / number;
        } catch (InputMismatchException | ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("Execute no matter what.");
        }
    }
}
