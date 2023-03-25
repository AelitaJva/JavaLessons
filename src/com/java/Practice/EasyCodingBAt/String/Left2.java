package com.java.Practice.EasyCodingBAt.String;

public class Left2 {
    public static void main(String[] args) {
        // Given a string, return a "rotated left 2" version
        // where the first 2 chars are moved to the end.
        // The string length will be at least 2.

        String str = "Star";
        String result = rotateLeft(str);
        System.out.println(result);

    }

    public static String rotateLeft (String str) {
        if (str.length () < 2) {
            return str;
        }

        String firsTwoChars = str.substring(0, 2);
        String theRestChars = str.substring(2);
        return theRestChars + firsTwoChars;
    }
}
