package com.java.class16;

public class whileLoop3A {
    public static void main(String[] args) {
        String str7 = "Hello DevXer";
        int vowel = 0;
        int consonant = 0;
        int lengthOfStr7 = str7.length();

        while (lengthOfStr7 > 0) {
            if (str7.charAt(lengthOfStr7 - 1) == 'a' || str7.charAt(lengthOfStr7 - 1) == 'e' || str7.charAt(lengthOfStr7 - 1) == 'i' || str7.charAt(lengthOfStr7 - 1) == 'o' || str7.charAt(lengthOfStr7 - 1) == 'u') {
                ++vowel;
                --lengthOfStr7;
            } else {
                ++consonant;
                --lengthOfStr7;
            }
        }
        System.out.println("Vowels: " + vowel);
        System.out.println("Consonant: " + consonant);
    }
}
