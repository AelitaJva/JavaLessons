package com.java.HomeWork.hw19;

public class task05 {
    public static void main(String[] args) {
        // ex 6:
        // 6.Java program to find sum of 1^2 + 2^2 + 3^2 + 4^2 + 5^2

        int sum = 0;
        for (int i = 1; i <=5; i++) {
            //sum = sum + (i * i);
            sum = sum + (int) Math.pow(i, 2);
        }
        System.out.println(sum);
    }
}
