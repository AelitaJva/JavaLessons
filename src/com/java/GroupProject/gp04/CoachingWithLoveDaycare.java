package com.java.GroupProject.gp04;

import java.util.Scanner;

public class CoachingWithLoveDaycare {
    public static void main(String[] args) {
/**
 * Write a java program for Coaching with Love Daycare.
 * Follow acceptance criteria:
 * age should be older than 1.5 but younger than 6 (inclusively)
 * if age is less than 3 years -> class name is Star and fee is 2000
 * if age is less than 6 years -> class name is Sun and fee is 1500
 * if they agree with the price -> print child is accepted.
 * otherwise child should not have a class and print he/she is not accepted.
 */

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your age: ");
        double age = sc.nextDouble();

        int price = 0;
        String childClass = "";

        if(age > 1.5 && age < 6) {
            if(age < 3) {
                childClass = "Star";
                price = 2000;
                System.out.println("Price is " + price +  " , child class is " + childClass);
            } else if(age < 6) {
                childClass = "Sun";
                price = 1500;
                System.out.println("Price is " + price +  " , child class is " + childClass);
            }

            System.out.println("Are you agree with the price? ");
            boolean agreement = sc.nextBoolean();
            if(agreement == true) {
                System.out.println(name + " you're accepted");
            } else
                System.out.println(name + " you aren't accepted");
        } else
            System.out.println("Something wrong with age, unfortunately,child is not accepted");
    }

}

