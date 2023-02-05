package com.java.homeWork.hw21;

public class reverseString {
    public static void main(String[] args) {
        String str = "DevX";
        String str2 = "";

        for (int i = str.length()-1; i >= 0; i--) {
            str2 = str2 + str.charAt(i);
        }
        System.out.println(str2);
    }
}
