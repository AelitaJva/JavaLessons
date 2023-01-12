package com.java.class12;

public class practiceAHMethods {
    public static void main(String[] args) {

        welcome();
        multiply(5, 5);
        multiply(6, 6);
        multiply(7, 7);
        divide(25, 5);
    }

    public static void welcome () {
        System.out.println("Welcome to my calculator!");
    }
    public static void multiply (int a, int b) {
        System.out.println(a * b);
    }
    public static void divide (int a, int b) {
        System.out.println(a / b);
    }
}
