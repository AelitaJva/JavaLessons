package com.java.Practice.Chirag;

import java.util.Scanner;

public class squarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        squarePattern(sc);
    }

    public static void squarePattern (Scanner sc) {
        System.out.println("How many rows do you want? ");
        int numberOfRows = sc.nextInt();

        for (int i=1; i<=numberOfRows; i++) {
            for (int j=1; j<=numberOfRows; j++ ) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
