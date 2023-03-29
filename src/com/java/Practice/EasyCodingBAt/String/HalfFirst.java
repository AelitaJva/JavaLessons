package com.java.Practice.EasyCodingBAt.String;

import java.util.Scanner;

public class HalfFirst {
    public static void main(String[] args) {
        // Given a string of even length, return the first half.
        // So the string "WooHoo" yields "Woo".

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.next();
        System.out.println(firstHalf(str));
    }

    public static String firstHalf (String str) {
        int half = str.length() / 2;
        return str.substring(0, half);
    }
}
