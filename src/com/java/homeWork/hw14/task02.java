package com.java.homeWork.hw14;

import java.util.Scanner;

public class task02 {
    public static void main(String[] args) {
        // Write a method that takes a string returns a new string
        // made of 3 copies of the last 2 chars of the original string.
        // The string length will be at least 2.
        //extraEnd(“Hi”) → “HiHiHi”
        //extraEnd(“Hello”) → “lololo”
        //extraEnd(“ab”) → “ababab”

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = sc.nextLine();
        System.out.println(copyOfTheWord(word));
    }

    public static String copyOfTheWord (String word) {
      String sub = word.substring(word.length()-2);
      return sub+sub+sub;
    }
}
