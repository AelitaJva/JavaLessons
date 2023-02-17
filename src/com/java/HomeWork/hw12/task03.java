package com.java.HomeWork.hw12;

import java.util.Scanner;

public class task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Are a member of the program and do u have a \'Target\' card to discount? (true/false)");
        boolean loyalCustomer = sc.nextBoolean();
        System.out.println("Enter the cost of a purchase ");
        double cost = sc.nextDouble();
        System.out.println(checkingLoyalty(loyalCustomer, cost));
    }

    public static double checkingLoyalty (boolean customer, double purchase) {
        if (customer) {
            purchase -= purchase * 0.1;
            return purchase;
        } else {
            return purchase;
        }
    }
}
