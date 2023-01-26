package com.java.practice.Chirag;

import java.util.Scanner;

public class positiveNegativeZero4 {
    public static void main(String[] args) {
        // check the number is positive, negative or zero

        Scanner sc  = new Scanner(System.in);
        String asking;

        do {
            System.out.print("Input a number: ");
            int i = sc.nextInt();

            if(i > 0) {
                System.out.println("positive number");
            } else if (i == 0) {
                System.out.println("zero");
            } else if (i < 0) {
                System.out.println("negative number");
            }

            System.out.println("Do u want to continue th perform? Yes/Not:");
            asking = sc.next();

        } while (asking.equalsIgnoreCase("yes"));
    }
}
