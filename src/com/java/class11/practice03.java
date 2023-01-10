package com.java.class11;

import java.util.Scanner;

public class practice03 {
    public static void main(String[] args) {
        // to write a program to input alphabet from user
        // and check is it vowel or consonant

        Scanner in = new Scanner(System.in);
        System.out.println("Please, input alphabet");

        char letter = in.nextLine(). charAt(0);

        switch (letter) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(letter + " is vowel");
                break;
            case 'b':
            case 'c':
            case 'd':
            case 'f':
            case 'g':
            case 'h':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                System.out.println(letter + "is consonant");
            default:
                System.out.println("Not valid alphabet");

        }
    }
}
