package com.java.GroupProject.gp03;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // char operator;
        // double num1, num2, num3;
        double result = 0;

        System.out.println("Enter number 1: ");
        double num1 = sc.nextDouble();

        System.out.println("Enter operator: ");
        char operator = sc.next().charAt(0);

        System.out.println("Enter number 2: ");
        double num2 = sc.nextDouble();


        if (operator == '+') {
            result = (num1 + num2);
            System.out.println(result);
        } else if (operator == '-') {
            result = (num1 - num2);
            System.out.println(result);
        } else if (operator == '*') {
            result = (num1 * num2);
            System.out.println(result);
        } else if (operator == '/') {
            result = (num1 / num2);
            System.out.println(result);
        } else
            System.out.println("Wrong operator");
    }
}
