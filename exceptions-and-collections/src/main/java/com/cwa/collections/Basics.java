package com.cwa.collections;

import java.util.Arrays;

public class Basics {

    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 5};
        tab[0] = 10;
        tab[2] = 5;
        tab[4] = 9;

        Arrays.sort(tab);
        int index = Arrays.binarySearch(tab, 10);
        System.out.println(index);

        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }

        int[][] matrix = new int[3][3];
        matrix[0][0] = 23;
    }
}
