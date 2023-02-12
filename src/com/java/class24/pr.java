package com.java.class24;

import java.util.Arrays;

public class pr {
    public static void main(String[] args) {
        int [] numbers = {2, 4, 5, 6};
        System.out.println(Arrays.toString(numbers));

        for (int temp:numbers) {
            System.out.println(temp);
        }

        System.out.println("=======================");

        int max = numbers[0];
        for (int temp:numbers) {
            if(max < temp) {
                max = temp;
            }
        }
        System.out.println("The greatest number: " + max);

        System.out.println("=======================");

        int min = numbers[0];
        for (int temp:numbers) {
            if(min > temp) {
                min = temp;
            }
        }
        System.out.println("The smallest number: " + min);
    }
}
