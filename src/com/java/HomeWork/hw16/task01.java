package com.java.HomeWork.hw16;

public class task01 {
    public static void main(String[] args) {
        // Write a program that calculates the sum of
        // all even numbers between 1 and a 100 using a while loop.
        //2+4+6+8 … = ?

        int i = 0;
        int sum = 0;
        while (i <= 100 && i % 2 == 0) {
            sum+=i;
            i+=2;
        }
        System.out.println(sum);
    }
}
