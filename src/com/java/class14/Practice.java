package com.java.class14;

public class Practice {
    public static void main(String[] args) {
        String word = "Hello World";
        System.out.println(lastLetter(word));
    }

    //public static char lastLetter (String another) {
       // return another.charAt(another.length()-1);
    //}

    public static char lastLetter(String str) {
        int length = str.length();
        return str.charAt(length-1);
    }
}
