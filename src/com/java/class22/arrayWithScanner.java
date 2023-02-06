package com.java.class22;

import java.util.Scanner;
// find the index of target number

public class arrayWithScanner {
    public static void main(String[] args) {
        int listOfData [] = new int [8];

        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter 10 numbers ");


        for (int i=0; i<listOfData.length; i++) {
            listOfData[i] = sc.nextInt();
        }

        System.out.println("Target number");
        int targetNum = sc.nextInt();

        for (int i=0; i<listOfData.length; i++) {
            if(listOfData[i] == targetNum) {
                System.out.println(i);
            }
        }
    }
}
