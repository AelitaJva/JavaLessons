package com.java.homeWork.hw11;

import java.util.Scanner;

public class task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input any operator with 2 whole numbers, I will print out the result of operation");
        System.out.print("First number: ");
        int n1 = sc.nextInt();
        System.out.print("Operator: ");
        char operator = sc.next().charAt(0);
        System.out.print("Second number: ");
        int n2 = sc.nextInt();

        switch (operator) {
            case '-':
                System.out.println(n1 - n2);
                break;
            case '+':
                System.out.println(n1 + n2);
                break;
            case '*':
                System.out.println(n1 * n2);
                break;
            case '/':
                if (n2 == 0) {
                    System.out.println("You can not divide first number by 0");
                    break;
                } else
                    System.out.println(n1 / n2);
                break;
        }
    }
}
