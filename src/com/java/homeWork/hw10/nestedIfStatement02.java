package com.java.homeWork.hw10;

import java.util.Scanner;

public class nestedIfStatement02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter your shitting destination: ");
        String destination = sc.nextLine();

        System.out.println("Enter your the weight of your item in lbs: ");
        double weight = sc.nextDouble();

        if(destination.equalsIgnoreCase("USA")) {
            if(weight<2) {
                System.out.println("Shipping cost is 5$");
            } else if(weight>=2) {
                double cost = weight*0.5d;
                System.out.println("Shipping cost is " + (int) cost + "$");
            }
        } else {
            double cost = weight*1.5d;
            System.out.println("Shipping cost is " + (int) cost + "$");
        }
    }
}
