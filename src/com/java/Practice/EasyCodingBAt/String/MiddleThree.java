package com.java.Practice.EasyCodingBAt.String;

import java.util.Scanner;

public class MiddleThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.next();
        System.out.println(findMiddle(str));
    }

    public static String findMiddle (String str) {
        if(str.length() <= 3) {
            return str;
        }

        // find the index of middle of the String
        int middleIndex = str.length() / 2;
        return str.substring(middleIndex-1, middleIndex+2);
    }
}
