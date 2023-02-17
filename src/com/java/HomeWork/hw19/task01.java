package com.java.HomeWork.hw19;

public class task01 {
    public static void main(String[] args) {
        // Write a program to print the sum of even numbers from 1 to 10

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            if(i % 2 == 0) {
                sum = sum + i;
                System.out.println("Even numbers: " + sum);
            }
        }
        System.out.println("The sum of even numbers: " + sum);
    }
}
