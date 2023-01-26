package com.java.practice;

import java.util.Scanner;

public class whileLoop2 {
    public static void main(String[] args) {
        // loop is to print out from 1 to 10


        Scanner sc = new Scanner(System.in);

        // for loop:
        // use when u know how many times the loop is going to run

           /*
        Syntax of for loops:

        for (initialization; condition; increment/decrement) {
        // body
        }
        */

        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello World");
        }


        // while loop:
        // use when u don't know how many times the loop is going to run
        // ex: taking the num from the user
        int n2 = 1;
        while (n2 <= 5) {
            System.out.println("Hello Wold");
            n2++;
        }

        // do while:

        int n3 = 1;

        do {
            System.out.println("Aelitaaaa");
        } while (n3 != 1);
    }
}
