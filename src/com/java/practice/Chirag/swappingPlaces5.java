package com.java.practice.Chirag;

import java.util.Scanner;

public class swappingPlaces5 {
    public static void main(String[] args) {
        // to swap the places of two variables
        Scanner sc = new Scanner(System.in);
        System.out.println("Input two numbers: ");
        int n1 = sc.nextInt();
        System.out.println("Input number one is " + n1);
        int n2 = sc.nextInt();
        System.out.println("Input number two is " + n2);

        int c;
        c = n1;
        n1 = n2;
        n2 = c;

        System.out.println("Output number one  now " + n1);
        System.out.println("Output number two is now " + n2);


//        int n1 = 10;
//        int n2 = 20;
//
//        int c;
//        c = n1; // 10
//        n1 = n2; //20
//        n2 =c;  //10
//
//        System.out.println(n1 + " is n1");
//        System.out.println(n2 + " is n2");
//        System.out.println(c);

    }
}
