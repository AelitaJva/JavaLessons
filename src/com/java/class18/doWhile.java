package com.java.class18;

import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String choice;

        do {

            System.out.println("Enter first number");
            int n1 = s.nextInt();

            System.out.println("Enter an operation number");
            String operation = s.next();

            System.out.println("Enter a second number");
            int n2 = s.nextInt();


            switch (operation.toLowerCase()) {
                case "add":
                case "+":
                    System.out.println(n1 + n2);
                    break;
                case "sub":
                case "-":
                    System.out.println(n1 - n2);
                    break;
                case "mul":
                case "*":
                    System.out.println(n1 * n2);
                    break;
                case "div":
                case "/":
                    System.out.println(n1 / n2);
                    break;
                default:
                    System.out.println("Wrong");
            }
            System.out.println("Whould u like to do more operations? yes/no?");
            choice = s.next();
        } while (choice.equalsIgnoreCase("yes"));
    }
}