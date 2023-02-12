package com.java.practice.Chirag;

import java.util.Scanner;

public class toReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        toReverseNumber(sc);
    }

    public static void toReverseNumber (Scanner sc) {
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int toCompare = num;

        int reverseVersion=0;
        while (num > 0) {
            int lastDigit = num % 10;
            reverseVersion=reverseVersion*10+lastDigit;
            num = num / 10;
        }

        System.out.println("Given number: " + toCompare);
        System.out.println("Reversed version: " + reverseVersion);
    }
}
