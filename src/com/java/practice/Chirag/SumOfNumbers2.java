package com.java.practice.Chirag;

public class SumOfNumbers2 {
    public static void main(String[] args) {

        double sum = 0;
        for (double i = 1; i <= 10; i++) {
            sum += i / (i + 1);
        }
        System.out.println(sum);
    }
}
