package com.java.homeWork.hw20;

import java.util.Scanner;

public class task05 {
    public static void main(String[] args) {
        // 5.  Write a program to print the reverse of the given number
        //Example1
        //Input - 86545
        //Output - 54568

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int i = sc.nextInt();
        int revLine = 0;

        while (i > 0) {
            revLine = revLine * 10 + i % 10;
            i = i / 10;
        }
        System.out.println(revLine);
    }
}
