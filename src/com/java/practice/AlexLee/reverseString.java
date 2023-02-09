package com.java.practice.AlexLee;

import java.util.Arrays;

public class reverseString {
    public static void main(String[] args) {
        String r = reverseWord("Hello World");
        reverseWord(r);
    }

    public static String reverseWord (String s) {
        char [] letters = new char[s.length()];

        for (int i=0; i<s.length(); i++) {
            System.out.println(s.charAt(i));
        }
        return s;
    }
}
