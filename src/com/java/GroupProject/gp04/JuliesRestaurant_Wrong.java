package com.java.GroupProject.gp04;

import java.util.Scanner;

public class JuliesRestaurant_Wrong {
    public static void main(String[] args) {


        /**
         *
         * Write a check to a customer based on their input
         * - how many people?
         * - what is the total amount?
         *      * automatically add 10% tax fee
         * - provide check together or split?
         *      * split - divide amount per person
         *      * together - one total amount for all
         * - how was the restaurant's service?
         *      * bad - 10%
         *      * ok - 15%
         *      * good - 20%
         *      * perfect - 25%
         *
         *
         * example output:
         * out: Welcome to Jolie's Restaurant!!!
         * out: Enter number of guests:
         *  in: 5
         * out: Enter a restaurant bill amount:
         *  in: 200
         * out: Is your check split?
         *  in: true
         * out: How was the restaurant's service? (Options: bad-10%, ok-15%, good-20%, perfect-25%)
         *  in: perfect
         * out: Number of guests: 5
         * out: Total amount: $275.0
         * out: Total per guest: $55.0
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Jolie's Restaurant!!!");
        System.out.print("Enter number of guests: ");
        int numOfGuest = sc.nextInt();
        System.out.print("Enter a restaurant bill amount: ");
        double billAmount = sc.nextDouble();
        System.out.println("How was the restaurant's service? (Options: bad-10%, ok-15%, good-20%, perfect-25%) ");
        String serviceQuality = sc.next();
        System.out.println("Is your check split? ");
        boolean isSplit = sc.nextBoolean();


        // double totalAmount = 0;
        // double totalAmountPerPerson = 0;
        double taxFee = billAmount * 0.1;

        if (serviceQuality.equals("25") || serviceQuality.equalsIgnoreCase("Perfect")) {
            System.out.println("Restaurant's service was perfect");
        }
        else if (serviceQuality.equals("20") || serviceQuality.equalsIgnoreCase("Good")) {
            System.out.println("Restaurant's service was good");
        } else if (serviceQuality.equals("15") || serviceQuality.equalsIgnoreCase("Ok")) {
            System.out.println("Restaurant's service was Ok");
        } else if (serviceQuality.equals("10") || serviceQuality.equalsIgnoreCase("Bad")) {
            System.out.println("Restaurant's service was bad");
        }

        double totalAmountPerPerson = 0;
        if (isSplit == true) {
            totalAmountPerPerson = (billAmount / numOfGuest) * taxFee;
            System.out.println("Number of guest: " + numOfGuest);
            System.out.println("Total amount per guest: " + totalAmountPerPerson);
        } else {
            double totalAmount = totalAmountPerPerson * numOfGuest;
            System.out.println("Number of guest: " + numOfGuest);
            System.out.println("Total amount: " + totalAmount);
        }
    }
}
