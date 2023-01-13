package com.java.GroupProject.gp02;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        /*
         * Write a program that takes number of minutes from user and converts the number to Years and Days
         *
         * Tasks:
         * 1) have a number long
         * 2) to get years, divide input number to the total number of minutes in year
         * 3) to get days, divide input number to the total minutes in one day, then modulus by total number of days in a year
         *
         *
         *
         * Example output:
         *  Input the number of minutes:
         *  3456789
         *  3456789 minutes is approximately 6 years and 210 days
         *
         */

        Scanner input = new Scanner (System.in);
        System.out.print("How many minutes have you played: ");

        int min = input.nextInt();
        int years1 = (int)  (min / 525600);

        int years = (int)  (min % 525600); // 525600 -> minutes a year
        int days = (int) ( years / 1440); // 1440 -> minutes a day

        System.out.println("You played " +years1+" years" +" and "+days +" days" );

    }
}
