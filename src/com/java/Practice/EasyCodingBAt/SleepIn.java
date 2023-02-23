package com.java.Practice.EasyCodingBAt;
import java.util.Scanner;

public class SleepIn {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sleepIn2(sc);
    }

    public static boolean sleepIn2(Scanner sc) {
        System.out.println("Are you on vacation? True/False ");
        boolean vacation = sc.nextBoolean();
        System.out.println("Are you in on a weekday? True?False ");
        boolean weekday = sc.nextBoolean();

        if (!weekday || vacation) {
            System.out.println("You can sleep");
            return true;
        } else {
            System.out.println("You can not sleep in on weekday. Try again");
            return sleepIn2(sc);
        }

    }
}
