package com.java.practice.Chirag;

import java.util.Scanner;

public class maxDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        maxDigit(sc);
    }

    public static void maxDigit (Scanner sc) {
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        int max = 1;
        while (number > 0) {
            int eachDigit = number % 10;
            if (eachDigit > max) {
                max=eachDigit;
            }
            number = number / 10;
        }

        System.out.println(max);
    }
}
