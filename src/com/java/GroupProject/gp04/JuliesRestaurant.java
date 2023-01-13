package com.java.GroupProject.gp04;

import java.util.Scanner;

public class JuliesRestaurant {
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
        System.out.println("Is your check split? ");
        boolean isSplit = sc.nextBoolean();
        System.out.println("How was the restaurant service: good, ok, perfect? ");
        boolean quality = sc.nextBoolean();


        double totalAmount = 0;
        double totalAmountPerPerson = 0;
        double taxFee = 0.1;


    }
}
