package com.java.class13;

public class task01 {
    public static void main(String[] args) {
        System.out.println(sum(4,4));
    }

    public static int sum (int num1, int num2) {
        if (num1 == num2) {
            return  (num1 + num2) * 2;
        } else {
            return  num1 + num2;
        }
    }
}
