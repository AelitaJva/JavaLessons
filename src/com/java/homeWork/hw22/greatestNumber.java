package com.java.homeWork.hw22;

import java.util.Scanner;

public class greatestNumber {
    public static void main(String[] args) {
        int listOfNumbers [] = new int[9];
        int maxNumber = listOfNumbers[0];

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter 9 numbers: ");

        for (int i=0; i<listOfNumbers.length; i++) {
            listOfNumbers[i] = sc.nextInt();
        }

        for (int i=1; i<listOfNumbers.length; i++) {
            if(listOfNumbers[i] > maxNumber) {
                maxNumber=listOfNumbers[i];
            }
        }
        System.out.println(maxNumber + " is the greatest number in Array");
    }
}
