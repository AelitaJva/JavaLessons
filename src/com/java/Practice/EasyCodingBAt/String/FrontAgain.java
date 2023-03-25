package com.java.Practice.EasyCodingBAt.String;

import java.util.Scanner;

public class FrontAgain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scanner.next();
        System.out.println(frontAndBack(str));

    }

    public static boolean frontAndBack (String str) {
        if(str.length() < 2) {
            return false;
        }

        String firstTwo = str.substring(0, 2);
        String lastTwo = str.substring(str.length()-2);
        return firstTwo.equals(lastTwo);
    }
}
