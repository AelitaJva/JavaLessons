package com.java.homeWork.hw19;

import java.util.Scanner;

public class task02 {
    public static void main(String[] args) {
        // 2. Write a program to count the number of divisions of the given numbers
        //For example - Number 6 has 4 divisors & 12 has 6 divisors

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int divisibleSum = 0;

        for (int i = 1; i <= n; i++) {
            if(n % i == 0) {
                System.out.println("factorial number of " + n + " is " + i);
                divisibleSum++;
            }
        }
        System.out.println(n + " has " + divisibleSum + " divisors");
    }
}
