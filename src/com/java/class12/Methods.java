package com.java.class12;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Where do u want to travel? ");
        String city = sc.nextLine();
        cityToTravel(city);

    }

    public static void cityToTravel(String city) {
        System.out.println("I want to travel to " + city);
    }
}
