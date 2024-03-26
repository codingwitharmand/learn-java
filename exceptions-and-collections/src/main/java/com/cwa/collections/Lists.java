package com.cwa.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Lists {

    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Guava");
        fruits.add("Mango");
        fruits.add("Cherry");
        fruits.add("Pineapple");
        fruits.add("Watermelon");
        Collections.sort(fruits);
        if(!fruits.contains("Banana")) {
            System.out.println("Banana.....");
        }

        int index = fruits.indexOf("Cherry");
        fruits.set(index, "Banana");

        Iterator<String> it = fruits.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        List<String> subList = fruits.subList(1, 4);
        for (String fruit : subList) {
            System.out.println(fruit);
        }
    }
}
