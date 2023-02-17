package com.java.Practice.Chirag;

import java.util.Scanner;

public class fullTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        fullTriangle(sc);

    }

    public static void fullTriangle (Scanner sc) {
        System.out.println("Enter how many stars do you want");
        int stars = sc.nextInt();

        for (int i=1; i<=stars; i++) {

            for (int s=1; s<=stars-i; s++) {
                System.out.print(" ");
            }
            for (int j=1; j<= 2*i-1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
