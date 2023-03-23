package com.java.class36;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int numbers[] = {2, 5, 7, 8};

        try {
            int n1 = sc.nextInt(), n2 = sc.nextInt();
            System.out.println(n1 / n2);
            System.out.println(numbers[5]);
        } catch (InputMismatchException e) {
            System.out.println("Please, try after hangover, enter numbers only");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }

        System.out.println("Welcome party");
        System.out.println("Enjoy your dinner");
    }

}