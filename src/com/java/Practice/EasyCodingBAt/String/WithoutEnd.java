package com.java.Practice.EasyCodingBAt.String;

public class WithoutEnd {
    public static void main(String[] args) {
        // Given a string, return a version without
        // the first and last char, so "Hello" yields "ell".
        // The string length will be at least 2.

        String str = "World with the happiness";
        System.out.println(withoutEnd(str));
    }

    public static String withoutEnd (String str) {
        String removeLetters = str.substring(1, str.length()-1);
        return removeLetters;
    }
}
