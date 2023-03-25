package com.java.Practice.EasyCodingBAt.String;

public class WithoutEnd2 {
    public static void main(String[] args) {
        // Given a string, return a version without
        // both the first and last char of the string.
        // The string may be any length, including 0.

         String str = "Hello";
        // String str = "ab";
        // String str = "";
        System.out.println(withoutEnds(str));

    }

    public static String withoutEnds (String str) {
        if (str.length () <= 2) {
            return "";
        }

        String result = str.substring(1, str.length () - 1);
        return result;
    }
}
