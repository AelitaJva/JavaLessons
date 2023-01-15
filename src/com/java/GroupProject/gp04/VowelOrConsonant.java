package com.java.GroupProject.gp04;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {

        /**
         *
         *  Write a Java program that takes a single character from the alphabet and
         *  Print Vowel or Consonant, depending on the user input.
         *  If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.
         *  Hint:
         *  lowercase letters are between 97 and 122 char
         *
         *  Example output:
         * Input an alphabet:
         * p
         * Input letter is Consonant
         *
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Input an alphabet: ");
        String enteredString = sc.next();

        // converts String to lower case char
        char toChar = enteredString.toLowerCase().charAt(0);

        // checks whether an input has 1 letter
        if(enteredString.length() > 1) {
            System.out.println("Input length is bigger then 1");
            System.exit(0);
        }


        String result = "vowel";
        // checks if char is numeric or alphabetic
        if(toChar == 'a' || toChar == 'i' || toChar == 'e' || toChar == 'u') {
            System.out.println(result);
        } else {
            result = "consonant";
            System.out.println(result);
        }
    }
}
