package com.java.Practice.EasyCodingBAt.String;

public class MinCat {
    public static void main(String[] args) {
        // Given two strings, append them together (known as "concatenation")
        // and return the result. However, if the strings are different lengths,
        // omit chars from the longer string so it is the same length as the shorter string.
        // So "Hello" and "Hi" yield "loHi". The strings may be any length.

        String a = "Hello";
        String b = "Pi";
        String result = concat(a, b);
        System.out.println(result);
    }

    public static String concat (String a, String b) {
        if(a.length() == b.length()) {
            return a.concat(b);
        }

        if(a.length() > b.length()) {
            int diff = a.length() - b.length();
            return a.substring(diff, a.length()) + b;
        } else {
            int diff = b.length() - a.length();
            return a + b.substring(diff, b.length());
        }
    }
}
