package com.java.class23;

import java.util.Scanner;

public class ex02_withMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruits [] = new String[6];

        for (int i=0; i<fruits.length; i++) {
            System.out.println("Enter 6 fruits: ");
            fruits [i] = sc.next().trim();
            findingDuplicate(fruits);
        }

    }

    public static void findingDuplicate (String [] fruits) {
        for (int i=0; i< fruits.length; i++) {
            for (int j = 1 + i; j < fruits.length; j++) {
                if(fruits[i].equals(fruits[j])) {
                    System.out.println(fruits[j]);
                }
            }
        }
    }
}
