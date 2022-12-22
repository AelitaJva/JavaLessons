package com.java.class09;

import java.util.Scanner;

public class ScannePractice2 {
    public static void main(String[] args) {

        // equal method doesn't work here
        // primitive = it is simple(basic)
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your gender? ");
        char gender  = sc.next().charAt(0);

        if (gender == 'M' || gender == 'm') {
            System.out.println("Go work hard");
        } else if (gender == 'F' || gender == 'f') {
            System.out.println("Enjoy your life");
        } else
            System.out.println("Wrong input");

    }
}
