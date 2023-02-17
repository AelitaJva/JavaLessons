package com.java.HomeWork.hw05;

import java.util.Scanner;

public class nestedPractice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Your age:");
        int age = sc.nextInt();

        System.out.println("Your salary: ");
        int salary = sc.nextInt();
//
//
//        if (age < 18) {
//            System.out.println("You aren't eligible");
//        }
//        if (age > 18 && age == 18 && salary < 5000) {
//            System.out.println("Sorry, you need work hard to get credit card");
//        }
//        else if (age >= 18 && salary >= 5000) {
//            System.out.println("You are eligible");
//        }
//        else if (age >= 18 && salary >= 20000) {
//            System.out.println("You will get free credit card");
//
//        }


        // Nested code:
        // this is the correct way
        // less code
        // no repeating = cleaner and safer

        // code is maintainability = the code easy to maintain and make change


        // this is for great programmer
        // our main taks is:
        // write clean work that can't brake
        // eligible for customers

        if (age < 18) {
            System.out.println("You aren't eligible");
        }
        else {
            if(salary < 5000)
                    System.out.println("Sorry, you need work hard");
            if (salary >= 5000)
                System.out.println("You are eligible");
             if(salary >= 20000)
                System.out.println("You will get free credit card");
        }

    }
}