package com.java.Practice.EasyCodingBAt.String;

public class WithoutX {
    public static void main(String[] args) {
        String str = "xHello Worldx";
        System.out.println("The word with x: " + str);
        String result = withoutX(str);
        System.out.println("The word without x in the beginning and at the end: " + result);

    }

    public static String withoutX (String str) {
        if(str.length() > 0 && str.charAt(0) == 'x') {
            str = str.substring(1);
        }

        if(str.length() > 0 && str.charAt(str.length()-1) == 'x') {
            str = str.substring(0, str.length()-1);
        }

        return  str;
    }
}
