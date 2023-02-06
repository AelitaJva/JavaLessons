package com.java.class22;

// 70 = index is 4
// check it

import java.util.Scanner;

public class FindIndexOfNumber {
    public static void main(String[] args) {
//        int listOfData [] = {10, 30, 50, 70, 30, 40, 45, 32};
//        int targetNumber = 70;
//        int index = -1;
//
//        for (int i=0; i<listOfData.length; i++) {     // length start from 1
//            if(listOfData[i] == targetNumber) {
//                index=i;
//                break;
//            }
//        }
//
//        if(index != -1) {
//            System.out.println("Index of " + targetNumber + " is " + index);
//        } else {
//            System.out.println("Index not found");
//        }

        int listOfNumbers[] = new int[7];
        int index = -1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter 7 numbers: ");

        for (int i = 0; i < listOfNumbers.length; i++) {
            listOfNumbers[i] = sc.nextInt();
        }

        System.out.println("Please, enter the target number: ");
        int targetNumber = sc.nextInt();

        for (int i = 0; i < listOfNumbers.length; i++) {
            if (listOfNumbers[i] == targetNumber) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Index of " + targetNumber + " is " + index);
        } else {
            System.out.println("Index not founded");
        }
    }
}
