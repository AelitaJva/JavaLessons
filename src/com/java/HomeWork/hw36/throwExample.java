package com.java.HomeWork.hw36;

import java.util.Scanner;

public class throwExample {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to identify days of month(1-12): ");
        int month = sc.nextInt();
        int days = 0;

        if(month == 1 || month == 3 || month == 12) {
            days = 31;
        } else if (month == 4) {
            days = 30;
        } else if(month == 2) {
            days = 29;
        } else {
            throw new Exception("Invalid month valur: " + month);
        }

        System.out.println("Number of days in month " + month + " is " + days);
    }
}
