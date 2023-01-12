package com.java.class12;

public class practiceAHReturnStatement {
    public static void main(String[] args) {

        printAMessage();
        int sum = add(5, 5);
        System.out.println(sum);
        String shouting = caps("Why are you reading my diary, Mom?");
        System.out.println(shouting);

    }
    // first
    public static void printAMessage() {
        System.out.println("Print a message");
    }

    // second
    public static int add(int a, int b) {
        return a + b;
    }

    // third
    public static String caps (String s) {
        return s.toUpperCase();
    }
}
