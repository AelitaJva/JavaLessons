package com.java.HomeWork.hw05;

import java.util.Scanner;

public class ifStatement3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Delta Air Lines! ");
        System.out.println("Are you travelling from connecting flight(true/false)?");

        String input = scan.nextLine();

        if(input.equalsIgnoreCase("true"))
            System.out.println("Enjoy your flight!");
        else
            System.out.println("Please proceed to the security check!");
    }
}
