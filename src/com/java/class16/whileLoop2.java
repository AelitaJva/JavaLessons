package com.java.class16;

// space complexity ==
// time complexity ==

public class whileLoop2 {
    public static void main(String[] args) {
        String stars = "*";
        int iterator = 0;

        while (iterator < 6) {
            System.out.println(stars);
            stars = stars.concat("*");
            iterator++;
        }

        String str = "*";
        while (str.length() < 5) {

            // u have a statement
            // that updates  the value of a variable that
            // is used in boolean expression

            str = str.concat("*"); // updating the value of varibale
            System.out.println();
        }

        int num = 10;
        while (num >= 0) {
            System.out.println(num);
            num--;

        }


        //
        // how to print one less character in a String? -> substring
        // substring(0, str.length()-1)
        //

        String str4 = "*****";
        while (str4.length() > 0) {
            System.out.println(str4);
            str4 = str4.substring(0, str4.length() - 1);
        }


        // print out even numbers until 20
        // 2 4 6 8 10
        int num3 = 0;
        while (num3 <= 20) {
            System.out.println(num3);
            num3 += 2;
        }

        // 2 way
        int num4 = 2;
        while (num4 > 20) {
            if (num4 % 2 == 0) {
                System.out.println(num4);
            }
            num4++;
        }


        // example 7
        // count number of vowel characters and
        // consonant characters in a String

        // String str = "Hello DevXer";
        // 4 = vowels
        // 9 - consonants including the space
        // the number of vowels?

        // pseudocode
        // iterate = look
        // iterate through all characters
        // if char is == e, o, it is vowel, otherwise is consonant


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