package com.java.groupProject.gp03;

import java.util.Scanner;

public class weather {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter weather outside: ");
        String weather = sc.next();

        System.out.println("Enter temperature: ");
        double temperature = sc.nextDouble();


        if (weather.equalsIgnoreCase("Sunny") && temperature == 120F) {
            System.out.println("Please, take sunglasses");
        } else if (weather.equalsIgnoreCase("Snowy") && temperature == -20F) {
            System.out.println("Please, take an umbrella and coat");
        } else if (weather.equalsIgnoreCase("Rainy") && temperature == 80F) {
            System.out.println("It is sunny, but gonna rain. Take an umbrella, please");
        }
    }
}
