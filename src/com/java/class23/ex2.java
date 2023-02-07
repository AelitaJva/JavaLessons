package com.java.class23;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        String fruit[] = new String[8];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 8 fruits: ");

        for (int i = 0; i < fruit.length; i++) {
            fruit[i] = sc.next().trim();          // print out without spaces
        }

        System.out.println("Duplicates: ");
        for (int i = 0; i < fruit.length; i++) {
            for (int j = i + 1; j < fruit.length; j++) {
                if (fruit[i].equals(fruit[j])) {
                    System.out.println(fruit[j]);

                }
            }
        }


    }
}
