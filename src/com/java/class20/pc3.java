package com.java.class20;

import java.util.Scanner;

// input - 4567
// output - 7 6 5 4
public class pc3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = sc.nextInt();
        int count = 0;

        while (n > 0) {
            // count = n % 10;  // last digit
            // System.out.println(count); //
            System.out.println(n % 10);
            n = n / 10;      // remove last digit by one
        }
        System.out.println(n);
    }
}
