package com.java.class20;


import java.util.Scanner;

public class pr2 {
    public static void main(String[] args) {
        // prime numbers
        // any numbers that are divisible by 1 and itself called prime number

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        System.out.println(count);

        if (count == 2) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }

    }
}
