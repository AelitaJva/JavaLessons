package com.java.practice.Chirag;

import java.util.Scanner;

public class SumOfDigitFromGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sum(sc);
    }

    public static void sum (Scanner sc ) {
        System.out.println("Enter a number: ");
        int numbers = sc.nextInt();

        int sum = 0;
       while (numbers > 0) {
           int eachDigit = numbers % 10;
           sum+=eachDigit;
           numbers/=10;
       }
        System.out.println(sum);
    }
}
