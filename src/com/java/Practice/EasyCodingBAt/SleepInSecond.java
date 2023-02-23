package com.java.Practice.EasyCodingBAt;

import java.util.Scanner;

public class SleepInSecond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Are you on vacation? True/False: ");
        boolean vacation = sc.nextBoolean();
        System.out.println("Are you on in weekday? True/False: ");
        boolean weekday = sc.nextBoolean();

        boolean shouldSleep = (!weekday || vacation);
        System.out.println(shouldSleep);
    }
}
