package com.java.practice.Easy;
import java.util.Scanner;

// Task:
// Given a string, if the string begins with "red" or "blue" return that color string
// otherwise return the empty string

public class task06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a String: ");

        String color = sc.nextLine();

        if(color.startsWith("red") || color.startsWith("Red")) {
            System.out.println("Color is red");
        } else if (color.startsWith("blue") || color.startsWith("Blue")) {
            System.out.println("Color is blue");
        } else {
            System.out.println("-----");
        }
    }
}
