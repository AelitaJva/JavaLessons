package com.java.class20;

import java.util.Scanner;

// digit of number
// to count number of digit in the given numbers
// input = 35435
// output = 5

public class pr3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = s.nextInt();

        int count = 0;

        while ( n > 0) {
            n = n / 10; // remove one digit from number
            count++;
        }
        System.out.println(count);


    }
}
