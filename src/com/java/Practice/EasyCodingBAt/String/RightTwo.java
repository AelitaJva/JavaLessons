package com.java.Practice.EasyCodingBAt.String;

import java.util.Scanner;

public class RightTwo {
    public static void main(String[] args) {
        // Given a string, return a "rotated right 2" version
        // where the last 2 chars are moved to the start.
        // The string length will be at least 2.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.next();
        System.out.println(rightTwo(str));
    }

    public static String rightTwo(String str) {
        if (str.length() <= 2) {
            return str;
        }

        String lastTwo = str.substring(str.length() - 2);
        String restPart = str.substring(0, str.length() - 2);
        return lastTwo + restPart;
    }
}
