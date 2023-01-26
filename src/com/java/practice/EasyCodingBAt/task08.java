package com.java.practice.EasyCodingBAt;

import java.util.Scanner;

// Given a string of even length, return a string made of the middle two chars,
// so the string "string" yields "ri". The string length will be at least 2.


public class task08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input a String");
        String str = sc.nextLine();

        int midd = str.length() / 2;
        String before = str.substring(midd - 1, midd);
        String after = str.substring(midd, midd + 1);
        System.out.println(before + after);


        // second way
        //  String result = str.substring((str.length()/2) - 1, (str.length()/2) + 1);


    }
}
