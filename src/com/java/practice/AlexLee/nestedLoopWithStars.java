package com.java.practice.AlexLee;

import java.util.Scanner;

public class nestedLoopWithStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many starts do you want?: ");
        int numOfStarts = sc.nextInt();


        for (int i=1; i<=numOfStarts; i++) {   // row
            for (int j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i=numOfStarts-1; i>0; i--) {
            for (int j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
