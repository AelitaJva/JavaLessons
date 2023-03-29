package com.java.Practice.EasyCodingBAt.String;

import java.util.Scanner;

public class DeFront {
    public static void main(String[] args) {
        // Given a string, return a version without
        // the first 2 chars. Except keep the first char
        // if it is 'a' and keep the second char if it is 'b'.
        // The string may be any length. Harder than it looks.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.next();
        System.out.println(deFront(str));
    }

    public static String deFront (String str) {
       if(str.length() <= 1) {
           if(str.startsWith("a")) {
               return str;
           }
           return "";
       }

       String firstChar = str.substring(0, 1);
       String secondChar = str.substring(1, 2);
       String restPart = str.substring(2);

       if(firstChar.equals("a") && secondChar.equals("b")) {
           return  str;
       }

       if(firstChar.equals("a")) {
           return firstChar + restPart;
       }

       if(secondChar.equals("b")) {
           return secondChar + restPart;
       }

       return restPart;
    }
}
