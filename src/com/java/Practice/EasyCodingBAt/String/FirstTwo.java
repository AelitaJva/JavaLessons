package com.java.Practice.EasyCodingBAt.String;

import java.util.Scanner;

public class FirstTwo {
    public static void main(String[] args) {
        // Given a string, return the string made of
        // its first two chars, so the String "Hello" yields "He".
        // If the string is shorter than length 2, return whatever there is,
        // so "X" yields "X", and the empty string "" yields the empty string "".
        // Note that str.length() returns the length of a string.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        java.lang.String str = sc.next();
        String result = returnFirstTwo(str);
        System.out.println("As a result the first two characters: " + result);
    }

    public static String returnFirstTwo (String str) {
        if (str.length() < 2) {
            return str;
        }

        if(str.length() == 0) {
            return "";
        }

        return str.substring(0, 2);
    }
}
