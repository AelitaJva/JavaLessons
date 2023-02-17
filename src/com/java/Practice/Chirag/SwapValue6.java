package com.java.Practice.Chirag;

public class SwapValue6 {
    public static void main(String[] args) {
        // to swap the value without using third variable

        int x = 10;
        int y = 36;

        x = x + y; // 10 + 36 = 46
        y = x - y; // 46 - 36 = 10;
        x = x - y; // 46 - 10 = 36;

        System.out.println("Value of X is " + x);
        System.out.println("Value of Y is " + y);

    }
}
