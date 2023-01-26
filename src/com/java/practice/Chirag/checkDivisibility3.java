package com.java.practice.Chirag;

import java.util.Scanner;

public class checkDivisibility3 {
    public static void main(String[] args) {
        // check the number is divisible by 3 or 5
        Scanner sc = new Scanner(System.in);
        String asking;

        do {
            System.out.print("Enter a number: ");
            int i = sc.nextInt();
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println(i + " is divisible by 3 or 5");
            } else {
                System.out.println(i + " is not divisible by 3 or 5");
            }
            System.out.println("Do u want to continue perform? Yes?Not?");
            asking = sc.next();
        } while (asking.equalsIgnoreCase("yes"));
    }
}
