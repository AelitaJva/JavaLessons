package com.java.groupProject.gp03;

import java.util.Scanner;

public class numberIdentifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number: ");
        int number = sc.nextInt();

        if(number == 0) {
            System.out.println(number + " - this is  zero");
        } else if(number > 0) {
            System.out.println(number + " - this is positive number");
        } else if(number < 0) {
            System.out.println(number + " - this is negative number");
        }
    }
}
