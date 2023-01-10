package com.java.class11;

import java.util.Scanner;

public class practice02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please, input month number");

        int num = in.nextInt();

        switch(num) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Total number of days is 31");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Total number of days is 30");
                break;
            case 2:
                System.out.println("Total number of days is 28/29");
                break;
            default:
                System.out.println("Not valid month number");
        }
    }
}
