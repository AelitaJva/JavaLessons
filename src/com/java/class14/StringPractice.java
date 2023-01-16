package com.java.class14;

public class StringPractice {
    public static void main(String[] args) {
        // how to concatenate a String

        String str = "Hello";
        String str2 = "DevX";

        // I can use + sign with String
        // It basically means I want to append one String

        String str3 = str + str2;
        System.out.println(str3);

        // adding a space
        String str4 = str + " " + str2;
        System.out.println(str4);

        int a  = 10;
        int b = 15;
        int sum = a + b;
        System.out.println(sum);

        // "10" is here is text
        String str5 = "10";
        String str6 = "5";
        String str7 = str5 + str6;
        System.out.println(str7);

        // because concatenating a String with different data type
        // everything turns(casts) into a String
        String str8 = a + str5;
        System.out.println(str8);


        // become with number = will start first with as int
        String str9 = 42 + 18 + "Devx";
        System.out.println(str9);

        // become with String = will start as String
        String str10 = "Hello" + 42 + 18 + "Devx";
        System.out.println(str10);
    }
}
