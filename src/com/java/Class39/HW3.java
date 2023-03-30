package com.java.Class39;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HW3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set <String> setOfWords = new HashSet<>();

        System.out.println("Enter any String");
        String str = sc.nextLine().replace(",", "");


        String [] arrayOfWords = str.split(" ");

        for (int i = 0; i < arrayOfWords.length; i++) {
            if(!setOfWords.add(arrayOfWords[i])) {
                setOfWords.remove(arrayOfWords[i]);
            }
        }

        System.out.println(setOfWords);
    }
}
