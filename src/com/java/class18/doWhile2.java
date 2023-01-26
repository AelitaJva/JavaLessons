package com.java.class18;

import java.util.Scanner;

public class doWhile2 {
    public static void main(String[] args) {
        // do loop:
        // execute body of the code
        // after that check the condition

        Scanner sc = new Scanner(System.in);
        String continueIt;

        do {
            System.out.println("Enter a number: ");
            int n = sc.nextInt();
            int result = n*n;
            System.out.println(result);
            System.out.println("Would u like to continue?");
            continueIt = sc.next();
        } while (continueIt.equalsIgnoreCase("yes"));

    }
}
