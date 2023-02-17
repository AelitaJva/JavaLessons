package com.java.HomeWork.hw11;

import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the day of the week");
        String day = sc.nextLine();

        switch (day) {
            case "Monday":
                System.out.println("6 days until Sunday");
                break;
            case "Tuesday":
                System.out.println("5 days until Sunday");
                break;
            case "Wednesday":
                System.out.println("4 days until Sunday");
                break;
            case "Thursday":
                System.out.println("3 days until Sunday");
                break;
            case "Friday":
                System.out.println("2 days until Sunday");
                break;
            case "Saturday":
                System.out.println("a day until Sunday");
                break;

        }
    }
}
