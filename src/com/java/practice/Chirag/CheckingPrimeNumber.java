package com.java.practice.Chirag;

public class CheckingPrimeNumber {
    public static void main (String[] args) {
        int num = 11;

        int count = 0;
        for (int i=1; i<=num; i++) {
            if(num % i == 0) {
                System.out.print("Divisible numbers:" + i);
                System.out.println();
                count++;
            }
        }
        System.out.println("Amount of divisible numbers: " + count);


        if(count <= 2) {
            System.out.println(num + " is prime");
        } else {
            System.out.println("Not prime");
        }
    }
}
