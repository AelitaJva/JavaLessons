package com.java.HomeWork.hw35;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input two integers: ");
        String str = null;

        try {
            int num1 = sc.nextInt(), num2 = sc.nextInt();
            System.out.println(num1 / num2);
            System.out.println(str.length());
        } catch (InputMismatchException e) {
            System.out.println("Unexpected input. Again: input two integers");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: Invalid divisor");
        } catch (NullPointerException e) {
            System.out.println("Error: String is null");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            int numbers[] = {1, 2, 3, 4, 5};
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("\"Finally\" all exceptions executed successfully");
        }

    }
}
