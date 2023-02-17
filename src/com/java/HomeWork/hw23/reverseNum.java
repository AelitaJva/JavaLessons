package com.java.HomeWork.hw23;

import java.util.Arrays;
import java.util.Scanner;

public class reverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers from 1 to 5: ");
        int collectionOfNumbers[] = new int[5];

        for (int i = 0; i < collectionOfNumbers.length; i++) {
            collectionOfNumbers[i] = sc.nextInt();
        }

        System.out.println("Entered numbers: " + Arrays.toString(collectionOfNumbers));
        System.out.print("Reversed numbers: ");

        reverseNumbers(collectionOfNumbers);
    }


    public static void reverseNumbers(int[] collectionOfNumbers) {
        for (int i = collectionOfNumbers.length - 1; i >= 0; i--) {
            System.out.print(collectionOfNumbers[i] + " ");
        }

    }

}
