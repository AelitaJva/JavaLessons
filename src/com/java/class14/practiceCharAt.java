package com.java.class14;

public class practiceCharAt {
    public static void main(String[] args) {
        String word = "Hello World Aelita";
        String wordSecond = "Hello my light and happy future";
        System.out.println(lastLetter(word));
        System.out.println(lLetter(wordSecond));
        System.out.println(subString(wordSecond));
        System.out.println(subString2(wordSecond));
    }

    // public static char lastLetter (String another) {
       // return another.charAt(another.length()-1);
    // }

//    public static char lastLetter(String str) {
//        int length = str.length();
//        return str.charAt(length-1);
//    }
    public static char lastLetter(String word) {
        int length = word.length();
        return word.charAt(word.length()-1);
    }

    public static char lLetter (String word1) {
        return word1.charAt(word1.length()-1);
    }

    public static String subString (String word3) {
        return word3.substring(19, 31);
    }

    public static String subString2 (String word3) {
        return word3.substring(25);
    }

}
