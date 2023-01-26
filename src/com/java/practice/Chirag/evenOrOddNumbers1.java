package com.java.practice.Chirag;

import java.util.Scanner;

public class evenOrOddNumbers1 {
    public static void main(String[] args) {
        // check the number is even or odd

        Scanner sc=  new Scanner(System.in);
        System.out.println("Enter a number: ");

        int n = sc.nextInt();

        if(n % 2 == 0 && n > 0) {
            System.out.println("The number is even");
        } else  {
            System.out.println("The number is odd");
        }
    }
}
