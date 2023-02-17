package com.java.HomeWork.hw12;

import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {
        // Create a method that takes a person's height as a double (in meters)
        // and returns their height in feet and inches. Google the formula.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your height in meters like \"1.56\" ");
        double height = sc.nextDouble();
        System.out.println("Height " + height);
        System.out.println("Your height in feet is " + heightInFeet(height) + " and in inch is " + heightInInch(height));

    }

    public static double heightInFeet (double height) {
        return height * 12;
    }
    public static double heightInInch (double height) {
        return height * 12.45;
    }
}
