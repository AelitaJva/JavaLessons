package com.java.GroupProject.gp09;

import java.util.Scanner;

public class firstAndLastLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 String");
        String[] words = {scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine()};
        findSpecificLetters(words);
    }

    public static void findSpecificLetters (String [] words) {
        for (int i=0; i<words.length; i++) {
            System.out.print("The first letter and the last letter of " + (i+1)+ " String is ");
            System.out.println(words[i].charAt(0) + " and " + words[i].charAt(words[i].length()-1));
        }
    }
}
