package com.java.class15;

public class practice {
    public static void main(String[] args) {
     String str = "I love waking up 5am";
     // check for the length of the String

        int length = "5am".length();
        int indexOf5am = str.indexOf("5am");

        System.out.println("Length of 5am: " + length);
        System.out.println("Index of 5am in str: " + indexOf5am);
        System.out.println("The sum of length and  " + indexOf5am+length);

        System.out.println(str.substring(indexOf5am, indexOf5am+length));

    }
}
