package com.java.homeWork.hw20;

public class task01 {
    public static void main(String[] args) {
        //   1. Write a program to find sum of 1^1 + 2^2 + 3^3 + 4^4 + 5^5
        int sum = 0;
        for(int i = 1; i <= 5; i++) {
            sum = sum + i * i;
            // sum+=i*i;
        }
        System.out.println(sum);
    }
}
