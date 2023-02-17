package com.java.Practice.AlexLee;

public class reverseString {
    public static void main(String[] args) {
        String s = reverseWord("Alex");           // new method
        System.out.println(s);
    }

    public static String  reverseWord (String r) {
        char [] letters = new char[r.length()];     // to store each character

        int index = 0;                              // to take indexes of a String to store in an Array
        for (int i=r.length()-1; i>=0; i--) {       // to take each character
            letters[index] = r.charAt(i);
            index++;
        }

        String reverse = "";
        for (int i=0; i< r.length(); i++) {          // to store reverse word
            reverse+=letters[i];
        }


        return reverse;                               // return reverse
    }
}
