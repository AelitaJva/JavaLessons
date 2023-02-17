package com.java.HomeWork.hw16;

public class task02 {
    public static void main(String[] args) {
        // 2. Write a program that prints all prime numbers
        // between 1 and a 100  using a while loop.

        int i = 1;
        while (i % 2 != 0 && i <= 100) {
            System.out.println(i);
            i+=2;
        }
    }
}
