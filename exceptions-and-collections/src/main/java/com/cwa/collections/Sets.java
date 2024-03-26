package com.cwa.collections;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

    public static void main(String[] args) {

        Set<String> cars = new TreeSet<>();
        cars.add("Audi");
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Renault");
        cars.add("Peugeot");

        Set<String> others = Set.of("Nissan", "Toyota");
        cars.addAll(others);

        List<Integer> numbers = List.of(5, 1, 9, 4, 3, 7, 4, 5);
        Set<Integer> set = new TreeSet<>();
        set.addAll(numbers);

        for (int num : set) {
            System.out.println(num);
        }
    }
}
