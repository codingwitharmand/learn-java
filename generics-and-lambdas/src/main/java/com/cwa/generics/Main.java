package com.cwa.generics;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        List<Integer> integers = List.of(1, 2, 3, 4);
        List<Double> doubles = List.of(1.3, 2.6, 3.0, 4.6);
        printList(doubles);

        List<? super Integer> integerList;
    }

    static <T> boolean isEqual(T element1, T element2) {
        return element1.equals(element2);
    }

    public static void printList(List<? extends Number> list) {
        for (Number n : list) {
            System.out.println(n);
        }
    }

}
