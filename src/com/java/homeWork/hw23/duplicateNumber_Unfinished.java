package com.java.homeWork.hw23;

import java.util.Scanner;

public class duplicateNumber_Unfinished {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 8 numbers: ");

        int num [] = new int[8];
        for (int i=0; i<8; i++) {
            num [i] = sc.nextInt();
        }
    }

    public static void duplicateNumber (int [] num) {
        for (int i=0; i<num.length; i++) {
            for (int j=i+1; j<num.length; j++) {
                if(num[i] == num[j]) {
                    System.out.println();
                }
            }
        }
    }
}
