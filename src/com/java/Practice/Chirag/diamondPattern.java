package com.java.Practice.Chirag;

import java.util.Scanner;

public class diamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of stars: ");
        int star = sc.nextInt();
        starPattern(star);

    }

    public static void starPattern (int star) {
        for (int i=1; i<=star; i++) {
            for (int s=1; s <= star-i; s++) {
                System.out.print(" ");
            }

            for (int j=1; j<=i*2-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i=star-1; i>=1; i--) {
            for (int s=1; s <= star-i; s++) {
                System.out.print(" ");
            }

            for (int j=1; j<=i*2-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
