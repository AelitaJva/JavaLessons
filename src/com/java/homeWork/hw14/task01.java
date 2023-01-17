package com.java.homeWork.hw14;

import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {
        // Write a method that takes a string and returns true
        // if the string starts with “hi” and false otherwise.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any word: ");
        String word1 = sc.nextLine();
        System.out.println(isStartWithHi(word1) + " - this word starts with \'hi\' ");
    }

    public static boolean isStartWithHi(String word1) {
        return word1.startsWith("Hi");
    }
}
