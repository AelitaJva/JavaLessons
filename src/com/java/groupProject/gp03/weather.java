package com.java.groupProject.gp03;

import java.util.Scanner;

public class weather {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String thingsToTake = "";

        System.out.println("Enter weather outside: ");
        String weather = sc.next();

        System.out.println("Enter temperature: ");
        int temperature = sc.nextInt();

        if (weather.equalsIgnoreCase("Sunny") && temperature == 120F) {
            thingsToTake = "Sunglasses";
            System.out.println("Please, take " + thingsToTake);
        } else if (weather.equalsIgnoreCase("Snowy") && temperature == -20F) {
            thingsToTake = "an umbrella and a coat";
            System.out.println("Please, take " + thingsToTake);
        } else if (weather.equalsIgnoreCase("Rainy") && temperature == 80F) {
            thingsToTake = "an umbrella";
            System.out.println("It is sunny, but gonna rain. Take " + thingsToTake + ",please" );
        }
    }
}
