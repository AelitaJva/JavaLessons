package com.java.homeWork.hw20;

import java.util.Scanner;

public class task04 {
    public static void main(String[] args) {
        //   4.  Write a program to print the greatest digit from the given number
        //Example1
        //Input - 86545
        //Output - Greatest digit is 8

        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number: ");
        int i = sc.nextInt();
        int maxNum = 1;

        while (i > 0) {
            if ( i % 10 > maxNum) {
                maxNum = i % 10;
            }
            i = i / 10;
        }
        System.out.println(maxNum);
    }
}
