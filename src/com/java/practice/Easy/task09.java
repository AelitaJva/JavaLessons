package com.java.practice.Easy;

import java.util.Scanner;

public class task09 {
    // Given a string of any length, return a new string where the last 2 chars,
    // if present, are swapped, so "coding" yields "codign".

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();


        // world == wordl
        String a = str.substring(0, str.length() - 2);
        String b = str.substring(str.length() - 2, str.length() - 1);
        String c = str.substring(str.length() - 1, str.length());
        System.out.println(a + b + c);

        // 2 way to solve
        // String result = str.substring(0, str.length()-2) + str.charAt(str.length()-1) + str.charAt(str.length()-2);
        //System.out.println(result);

    }
}
