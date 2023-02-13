package com.java.practice.Chirag;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        // program to print out the sum of even numbers from 1 to 22

        int sum = 0;

        for (int i = 1; i <= 22; i++) {
            if(i % 2 == 0) {
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
