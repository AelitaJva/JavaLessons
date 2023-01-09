package com.java.class10;

import java.util.Scanner;

public class ifStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input 3 numbers: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();

//        if(n1>n2 && n1>3) {
//            System.out.println("The largest number is: " + n1);
//        } else if(n2 > n1 && n2 > n3) {
//            System.out.println("The largest is: " + n2);
//        } else if(n3== n1 && n3 == n2) {
//            System.out.println("All of the equal");
//        }
        if(n1>=n2 && n1 > n3) {
            System.out.println("The biggest number is " + n1);
        } else if (n2>n1 && n2>=n3) {
            System.out.println(n2);
        } else if(n3>n2 && n3>n1) {
            System.out.println(n3);
        } else if(n1==n2 && n1==n3) {
            System.out.println("They are equals");
        }
    }
}
