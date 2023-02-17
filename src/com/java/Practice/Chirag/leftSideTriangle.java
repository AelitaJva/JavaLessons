package com.java.Practice.Chirag;

import java.util.Scanner;

public class leftSideTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        leftSideTriangle(sc);
    }

    public static void leftSideTriangle (Scanner sc) {
        System.out.println("How many rows do you want? ");
        int numberOfRows = sc.nextInt();

        for (int i=1; i<=numberOfRows; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
