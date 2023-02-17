package com.java.HomeWork.hw20;

public class task02 {
    public static void main(String[] args) {
        // 2. Write a program to find sum of 1/2 + 2/3 + 3/4 + 4/5 +......10/11

        double sum = 0;
        for (double i = 1, j = 2; i <= 10; i++, j++) {
            sum += i / j;
        }
        System.out.println(sum);


    }
}
