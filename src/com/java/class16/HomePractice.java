package com.java.class16;

public class HomePractice {
    public static void main(String[] args) {
        String str = "*";
        int integer = 0;

        while (integer < 15) {
            System.out.println(str);
            str = str.concat("*");
            integer++;
        }

        String str1 = "#";
         for (int i = 0; i < 10; i++) {
             System.out.println(str1);
             str1 = str1.concat("*");
         }
    }
}
