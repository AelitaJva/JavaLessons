package com.java.class13;

import java.util.Scanner;

public class task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(inTheRange(n1, n2));
    }

    public static boolean inTheRange(int n1, int n2) {
        return n1 >= 10 && n1 <= 20 && n2 >= 10 && n2 <= 20;
    }
}


