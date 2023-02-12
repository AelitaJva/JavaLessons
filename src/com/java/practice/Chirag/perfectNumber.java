package com.java.practice.Chirag;

import java.util.Scanner;

public class perfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        perfectNumber(sc);
    }

    public static void perfectNumber(Scanner sc) {
        System.out.println("Which number do you want to check whether is perfect num or not?");
        int number = sc.nextInt();

        int sumOfNum = 0;
        for (int i = 1; i < number; i++) {
           if (number % i == 0) {
               sumOfNum+=i;
           }
        }

        System.out.println("Sum of divisible numbers: " + sumOfNum);
        System.out.println("Given number: " + number);

        if(sumOfNum == number) {
            System.out.println("Perfect");
        } else {
            System.out.println("Not perfect");
        }
    }
}
