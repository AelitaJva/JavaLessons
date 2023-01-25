package com.java.class17;

import java.util.Scanner;

public class task04 {
    public static void main(String[] args) {
        // print out every other character of a String
        // skipping every char
        // ex: Java
        // a a
        // ex: Hello
        // e o
        // ex: World
        // e l

        Scanner sc = new Scanner(System.in);
        System.out.println("Please, input a String: ");
        String str = sc.nextLine();

        int index = 1;

        while (index < str.length()) {
            System.out.println(str.charAt(index));
            index = index + 2;
        }

        String str3 = "Aelita";

        int ind2 = 1;

        while (ind2 < str3.length()) {
            System.out.println(str.charAt(ind2));
            ind2 = ind2 + 2;
        }
    }
}
