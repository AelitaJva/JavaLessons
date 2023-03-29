package com.java.Class38;
// Find duplicate characters in the String

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumbers {
    public static void main(String[] args) {
        String str = "We are almost finishing java";
        Set<Character> setOfChar = new HashSet<>();
        Set<Character> setOfDuplicateChar = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            //System.out.println(str.charAt(i) + " " + setOfChar.add(str.charAt(i)));
            if (setOfChar.add(str.charAt(i)) == false) {
                setOfDuplicateChar.add(str.charAt(i));
            }
        }
        System.out.println(setOfDuplicateChar);

    }
}
