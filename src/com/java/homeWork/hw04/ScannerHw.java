package com.java.homeWork.hw04;

import java.util.Scanner;

public class ScannerHw {
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = info.nextInt();
        System.out.println("age -> " + age);

        System.out.println("Enter your credit score: ");
        int creditScore = info.nextInt();
        System.out.println("Credit score -> " + creditScore);

        System.out.println("Enter your marital status: ");
        String maritalStatus = info.next();
        System.out.println("Marital status ->" + maritalStatus);

        System.out.println("=======Results=======");


        boolean result = age > 25 || creditScore > 700 || !maritalStatus.equals("Married");
        System.out.println("Result: " + result);
        System.out.println("=======================");

        boolean result2 = age > 25 && creditScore > 700 && maritalStatus.equalsIgnoreCase("married");
        System.out.println("Result2: " + result2);
    }
}
