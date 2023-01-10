package com.java.class11;

import java.util.Scanner;

public class practice04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        switch (num1 % 2) {
            case 0:
                System.out.println("this is even number");
                break;
            case 1:
                System.out.println("this is odd number");
        }
    }
}
