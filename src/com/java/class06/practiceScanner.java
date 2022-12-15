package com.java.class06;

import java.util.Scanner;

// equall()

public class practiceScanner {
    public static void main(String[] args) {


        Scanner log = new Scanner(System.in);

        System.out.println("Enter username: ");
        String name = log.nextLine();

        System.out.println("Enter your password: ");
        String passw = log.nextLine();

        boolean result = name.equalsIgnoreCase("best@devx.com") && passw.equals("Fall2022");
        System.out.println(result);
        System.out.print("Input data: ");
        System.out.println(name);
        System.out.println(passw);

//        boolean result = name.equals("best@devx.com") && passw.equals("Fall2022");
//        System.out.println(result);

//        boolean result1 = name.equals("best@devx.com") || !passw.equals("Fall2022");
//        System.out.println(result1);

    }
}
