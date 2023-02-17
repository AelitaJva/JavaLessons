package com.java.Practice.Chirag;

import java.util.Scanner;

public class rightSideTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        rightSideTriangle(sc);
    }

    public static void rightSideTriangle (Scanner sc) {
        System.out.println("How many rows do you want?");
        int amountOfRows = sc.nextInt();

        for (int i=1; i<=amountOfRows; i++) {

            for (int s=1; s<=amountOfRows-i; s++) {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++) {
                System.out.print(i);
            }

            System.out.println();
        }
    }
}
