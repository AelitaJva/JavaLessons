package com.java.GroupProject.gp09;

import java.util.Arrays;
import java.util.Scanner;

public class numberOfEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        int listOfNumbers[] = {sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};
        System.out.println("Number of even numbers: " + findNumberOfEvens(listOfNumbers));

    }

    public static int findNumberOfEvens(int[] listOfNumbers) {
        int amountOfEvens = 0;
        for (int i = 0; i < listOfNumbers.length; i++) {
            if (listOfNumbers[i] % 2 == 0) {
                amountOfEvens++;
            }
        }
        return amountOfEvens;
    }
}
