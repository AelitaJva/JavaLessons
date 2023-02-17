package com.java.HomeWork.hw21;

import java.util.Scanner;

public class numberOfVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();

        int vowel = 0;
        for (int i=0; i<str.length(); i++) {
            char letter = str.charAt(i);

            if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'u' || letter == 'o' ||
            letter == 'A' || letter == 'E' || letter == 'I' || letter == 'U' || letter == 'O') {
                vowel++;
            }
        }
        System.out.println("Number of vowels: " + vowel);
    }
}
