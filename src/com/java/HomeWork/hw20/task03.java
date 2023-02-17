package com.java.HomeWork.hw20;

import java.util.Scanner;

public class task03 {
    public static void main(String[] args) {
        // 3. Write a program to print the sum of each digit from the given number
        //Example1
        //Input - 3521
        //Output - 11

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;

        while (n > 0) {
            //int lastDigit = n % 10;
            //sum = sum + lastDigit;
            sum = sum + n % 10;
            //System.out.println(n % 10); // gives the last digit
            n = n / 10;                 // remove the last digit by one
        }
        System.out.println(sum);
    }
}
