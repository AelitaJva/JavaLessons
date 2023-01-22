package com.java.practice.Easy;

import java.util.Scanner;

public class task02 {
    public static void main(String[] args) {
        // Original String = Java Exercises!
        //The character at position 0 is J
        //The character at position 10 is i
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the String");
        String w = sc.nextLine();
        System.out.println(w);
        System.out.println("first char is " + firstInd(w) + " and last char is " + lastInd(w));

    }

    public static char firstInd (String w) {
        return w.charAt(0);
    }

    public static char lastInd (String w) {
        return w.charAt(w.length()-1);
    }
}
