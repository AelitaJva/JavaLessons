package com.java.Practice.Chirag;

import java.util.Scanner;

public class ToCountNumberOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        toCount(sc);

    }
    public static void toCount (Scanner sc) {
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int count=0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        System.out.println(count);

    }
}
