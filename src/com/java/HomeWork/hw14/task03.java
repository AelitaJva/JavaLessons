package com.java.HomeWork.hw14;

import java.util.Scanner;

public class task03 {
    public static void main(String[] args) {
        //Given a string of any length, return a new string where the last 2 chars,
        //if present, are swapped, so “coding” yields “codign”.
        //lastTwo(“coding”) → “codign”
        //lastTwo(“cat”) → “cta”
        //lastTwo(“ab”) → “ba”

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = sc.nextLine();
        System.out.println(changing(word));

    }

    public static String changing (String word) {
        String sub = word.substring(0, word.length()-2) + word.charAt(word.length()-1) + word.charAt(word.length()-2);
        return sub;
    }
}
