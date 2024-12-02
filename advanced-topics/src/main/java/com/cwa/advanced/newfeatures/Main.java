package com.cwa.advanced.newfeatures;

import java.time.Duration;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime inOneHour = now.plusHours(1);

        Duration duration = Duration.between(now, inOneHour);
        System.out.println(duration.getSeconds());

        // Text blocks
        String query = """
                SELECT * FROM users
                WHERE id = ?
                """;

        // Records
        var toby = new Person("Toby", 12);
        System.out.println(toby);

        // Pattern matching
        var object = "Hello world.";
        if (object instanceof String str) {
            System.out.println(str);
        }
    }

    sealed class Shape permits Circle, Rectangle, Triangle {}
    final class Circle extends Shape {}
    final class Rectangle extends Shape {}
    non-sealed class Triangle extends Shape {}
    class EquilateralTriangle extends Triangle {}
}
