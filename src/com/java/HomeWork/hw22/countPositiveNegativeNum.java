package com.java.HomeWork.hw22;

import java.util.Scanner;

public class countPositiveNegativeNum {
    public static void main(String[] args) {
        int listOfNumbers [] = new int[7];
        int positiveNum = 0;
        int negativeNum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 7 numbers: ");
        for (int i=0; i<listOfNumbers.length; i++) {
            listOfNumbers [i] = sc.nextInt();
        }

        for (int i=0; i<listOfNumbers.length; i++) {
            if(listOfNumbers[i] >= 0) {
                positiveNum++;
            } else {
                negativeNum++;
            }
        }
        System.out.println("Amount of positive numbers is: " + positiveNum);
        System.out.println("Amount of negative numbers is: " + negativeNum);
    }
}
