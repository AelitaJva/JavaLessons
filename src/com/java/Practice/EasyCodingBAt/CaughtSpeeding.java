package com.java.Practice.EasyCodingBAt;

import java.util.Scanner;

public class CaughtSpeeding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = caughtSpeeding(sc);
        System.out.println(result);

    }

    public static int caughtSpeeding (Scanner sc) {
        System.out.println("Speed? ");
        int speed = sc.nextInt();
        System.out.println("Today is your birthday?");
        boolean isBirthday = sc.nextBoolean();

        if (isBirthday) {
            speed-=5;
        }

        if (speed <= 60) {
            return 0;
        } else if( speed >= 61 && speed >= 80) {
            return 1;
        } else {
            return 2;
        }
    }
}
