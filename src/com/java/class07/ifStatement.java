package com.java.class07;

import java.util.Scanner;

public class ifStatement {
    // logical flow control
    // u can write a program that executes certain of the code
    // only in certain conditions
    public static void main(String[] args) {
        if (true) {// it will print out hello world

            System.out.println("Hello World");
        }
        //if it false print out outside
        System.out.println("I am outside of if ");


        if (false)
            System.out.println("Hello");
        System.out.println("Hello Mars"); // ths  line in fact outside of the if statement space

        int gallonOfOil = 400;
        if (gallonOfOil > 1000) { // expresssion is false, so print out false
            System.out.println("Hello World");
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Your age: ");

        int age1 = input.nextInt();

        if (age1 > 16)
            System.out.println("You are eligible to drive");


        int weather = input.nextInt();

        if (weather < 32) {
            System.out.println("It's freezing. Stay home");
        } else if (weather >= 32) {
            System.out.println("It is little chilly outside");
        } else if (weather == 42 && weather < 68) {
            System.out.println("It is a good weather outside. Go get fresh air");
        } else if (weather >= 68) {
            System.out.println(" Let's go bitch");
        }

        // reformat code => code =>  сtrl+ alt + l


    }
}
