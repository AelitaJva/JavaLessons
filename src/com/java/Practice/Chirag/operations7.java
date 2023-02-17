package com.java.Practice.Chirag;

import java.util.Scanner;

public class operations7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which operation do you want to perform: Add, Sub, Mul, Div?");

        String operation = sc.nextLine();
       // String operation = "Mul";
        int n1 = 20;
        int n2 = 39;

        switch (operation) {
            case "Add":
                System.out.println(n1+n2);
                break;
            case "Sub":
                System.out.println(n1-n2);
                break;
            case "Mul":
                System.out.println(n1*n2);
                break;
            case "Div":
                System.out.println(n1/n2);
                break;
            default:
                System.out.println("Wrong operation");
        }
    }
}
