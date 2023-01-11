package com.java.class11;

import java.util.Scanner;

public class practice06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a and b in integer: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        switch (a) {
            case 1:
                switch (b) {
                    case 1:
                        System.out.println("b is 1");
                        break;
                    case 2:
                        System.out.println("b is 2");
                        break;
                    case 3:
                        System.out.println("b is 3");
                        break;
                }
                break;
            case 2:
                System.out.println("a is 2");
                break; 
            case 3:
                System.out.println("a is 3");
                break;

            default:
                System.out.println("Invalid");
                break;
        }
    }
}
