package com.java.practice.Chirag;

import java.util.Scanner;

public class tableOf5 {
    public static void main(String[] args) {
        // program to print out the table of number 5
        // 5 * 1 = 5
        // 5 * 2 = 10
        // 5 * 3 = 15

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number * i);
        }

    }
}
