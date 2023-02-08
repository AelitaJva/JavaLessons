package com.java.hw23;

import java.util.Arrays;

public class oddPosition {
    public static void main(String[] args) {
        int numbers [] = {45, 65, 85, 24, 45, 85, 34, 65, 45, 85};
        System.out.println(Arrays.toString(numbers));
        System.out.println();
        System.out.println("Numbers in odd position: ");

        for (int i=0; i<numbers.length; i+=2) {
            System.out.println(numbers[i]);
        }
    }
}
