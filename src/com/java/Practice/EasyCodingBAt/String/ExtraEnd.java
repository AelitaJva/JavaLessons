package com.java.Practice.EasyCodingBAt.String;

public class ExtraEnd {
    public static void main(String[] args) {
        // Given a string, return a new string made of 3 copies
        // of the last 2 chars of the original string.
        // The string length will be at least 2.

        String str = "Hello";
        System.out.println(extraEnd(str));
    }

    public static String extraEnd(String str) {
        str = "Hello";
        if (str.length() <= 2) {
            return str;
        }

        String lastTwo = str.substring(str.length() - 2);
        return lastTwo + lastTwo + lastTwo;
    }
}
