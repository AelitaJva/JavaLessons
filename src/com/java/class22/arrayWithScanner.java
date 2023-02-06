package com.java.class22;

import java.util.Scanner;
// find the index of target number

public class arrayWithScanner {
    public static void main(String[] args) {
        int listOfNumbers [] = new int[7];              // initialization the value of the variable in Array

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter 7 numbers: ");


        for (int i=0; i<listOfNumbers.length; i++) {     // taking the each number from the user
            listOfNumbers[i] = sc.nextInt();
        }


        System.out.println("Enter the target number: ");  // taking the target number from the user
        int targetNumber = sc.nextInt();

        for (int i=0; i<listOfNumbers.length; i++) {       // logic for finding the index of the target number
            if(listOfNumbers[i] == targetNumber) {
                System.out.println(i);
            }
        }

    }
}
