package com.java.practice.Chirag;

import java.util.Scanner;

public class DivisorOfGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;

        for (int i=1;i<=num; i++) {
            if(num % i == 0) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Count: " + count);
    }
}
