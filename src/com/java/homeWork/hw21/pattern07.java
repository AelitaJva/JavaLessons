package com.java.homeWork.hw21;

import java.util.Scanner;

public class pattern07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();


        for (int i = 1; i <= num; i++) {     // row

            // space
            for (int s = 1; s <= num - i; s++) {
                System.out.print(" ");
            }

            // digit
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i=num; i>=1; i--) {     // i => number of rows

            // space
            for (int s=1; s<=num-i; s++) {
                System.out.print(" ");
            }

            // digit
            for (int j=1; j<=i*2-1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
