package com.java.practice;

public class task01 {
    public static void main(String[] args) {
        String w = "New York, America";
        System.out.println(w);
        System.out.println(pointer(w));

    }

    public static int pointer (String w) {
        return w.length();
    }
}
