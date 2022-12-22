package com.java.class09;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your gender? F or M");

        // when u hit . and have a name ending with a ()
        String gender = sc.next();

        // charAt(0) method takes the first character of a String
        char genderInCharDataType = gender.charAt(0);

        // 0 means 1, 1 means 2 in programming
        System.out.println(gender);
        System.out.println(genderInCharDataType);

        System.out.println("What is your Tesla Model? ");
        //String tModel = sc.next();

        char teslaModel = sc.next().charAt(0);
        System.out.println(teslaModel);














    }
}
