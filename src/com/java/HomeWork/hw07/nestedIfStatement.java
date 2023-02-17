package com.java.HomeWork.hw07;

import java.util.Scanner;

public class nestedIfStatement {
    // 43 54 24
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numbers: ");

        System.out.println("Number 1:");
        int n1 = sc.nextInt();

        System.out.println("Number 2: ");
        int n2 = sc.nextInt();

        System.out.println("Number 3: ");
        int n3 = sc.nextInt();


        if(n1 > n2 && n1 > n3) {
            System.out.println(n1);
        } else {
            if(n2 > n1 && n2 > n3) {
                System.out.println(n2);
            } else {
                if(n3 > n1 && n3 > n2) {
                    System.out.println(n3);
                }
            }
        }
    }
}
