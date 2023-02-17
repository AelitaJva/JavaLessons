package com.java.Practice.EasyCodingBAt;
import java.util.Scanner;

// Given a string, return a new string made of 3 copies
// of the first 2 chars of the original string.
// The string may be any length. If there are fewer
// than 2 chars, use whatever is there.

public class task07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input a String: ");
        String word = sc.nextLine();


        if(word.length() >= 2 ) {
            String extraFront = word.substring(0, 2);
           System.out.println(extraFront+extraFront+extraFront);
        } else if (word.length() == 1) {
            String extraFront = word.substring(0, 1);
            System.out.println(extraFront+extraFront+extraFront);
        } else if (word.length() == 0) {
            System.out.println("-----");
        }

    }
}
