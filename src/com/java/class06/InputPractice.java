package com.java.class06;

import java.util.Scanner;

public class InputPractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your marital status: ");
        boolean maritalStatus = input.nextBoolean();
        System.out.println("Your marital status: " + maritalStatus);




    }
}
