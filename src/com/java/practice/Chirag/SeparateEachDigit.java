package com.java.practice.Chirag;

import java.util.Scanner;
// 123
// 1
// 2
// 3

public class SeparateEachDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        separateEachDigit(sc);
    }

    public static void separateEachDigit (Scanner sc) {
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        while (number != 0) {
            System.out.println(number % 10);
            number /=10;
        }

    }
}
