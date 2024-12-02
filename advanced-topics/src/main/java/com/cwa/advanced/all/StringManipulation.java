package com.cwa.advanced.all;

import java.util.Optional;

/**
 * Understand String manipulation techniques
 */
public class StringManipulation {
    public static void main(String[] args) {
        String[] s = null;
        var t = Optional.ofNullable(s).filter(f -> f.length > 0).map(x -> x[0]);
        System.out.println(t.orElse("null"));
        String greeting = "Hello";
        String name = "Alice";
        System.out.println(greeting + " " + name);
        String name2 = "alice";
        char initial = greeting.charAt(0);
        System.out.println(initial);
        System.out.println(greeting.length());
        String subString = greeting.substring(0, 3);
        System.out.println(subString);

        String greetingAlice = greeting + " " + name;
        /*System.out.println(greetingAlice.contains(name));
        System.out.println(greetingAlice.startsWith(greeting));*/

        String birthdate = "20/05/2002";
        String[] items = birthdate.split("/");
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]);
        }

        boolean match = "12345".matches("\\d+");
        System.out.println(match);

        StringBuilder builder = new StringBuilder();
        builder.append(greeting).append(" ").append(name);
        System.out.println(builder);
    }

}
