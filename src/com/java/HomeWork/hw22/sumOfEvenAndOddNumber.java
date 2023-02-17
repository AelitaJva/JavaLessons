package com.java.HomeWork.hw22;

import java.util.Scanner;

import static java.lang.System.*;

public class sumOfEvenAndOddNumber {
    public static void main(String[] args) {
        int listOfNumbers[] = new int[7];
        int sumOfEven = 0;
        int sumOfOdd =  0;

        Scanner sc = new Scanner(System.in);
        out.println("Enter 7 numbers");

        for (int i=0; i<listOfNumbers.length; i++) {
            listOfNumbers[i] = sc.nextInt();
        }

        for (int i=0; i<listOfNumbers.length; i++) {
            if(listOfNumbers[i] % 2 == 0) {
                sumOfEven+=listOfNumbers[i];
            } else {
                sumOfOdd+=listOfNumbers[i];
            }
        }

        out.println("Sum of even numbers is: " + sumOfEven);
        out.println("Sum of odd numbers is: " + sumOfOdd);


    }
}


