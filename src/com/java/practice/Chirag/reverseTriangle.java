package com.java.practice.Chirag;

import java.util.Scanner;

public class reverseTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        trianglePattern(sc);
    }

    public static void trianglePattern(Scanner sc) {
        System.out.println("Enter how many stars do you want? ");
        int stars = sc.nextInt();

        for(int i=stars; i>=1; i--) {
            for (int s=1; s<=stars-i; s++) {
                System.out.print(" ");
            }

            for (int j=1; j<=i*2-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
