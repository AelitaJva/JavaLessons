package com.java.class13;

import java.util.Scanner;

public class InstanceMethods2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        System.out.println("Enter first non-negative number: ");
        int n1 = sc.nextInt();
        System.out.println("Enter second non-negative number: ");
        int n2 = sc.nextInt();

        InstanceMethods2 newVar = new InstanceMethods2();
        //System.out.println(newVar.finding1(n1, n2));
        //System.out.println(newVar.finding2(n1));
        System.out.println(newVar.finding3(n1, n2));

    }
    // first
    public boolean finding1 (int n1, int n2) {
        if( n1 >= 0 && n2 >= 0) {
            if(n1 % 10 == n2 % 10) {
                return true;
            }
        } return false;
    }

    // second example
    public boolean finding2(int n1) {
        if(n1 > 0 ) {
            return (n1 % 3 == 00 || n1 % 5 == 0) ;
        }  else {
            return false;
        }
    }

    // third
     public boolean finding3 (int n1, int n2) {
        return n1 == 10 || n2 == 10 || n1 + n2 == 10;
     }
}
