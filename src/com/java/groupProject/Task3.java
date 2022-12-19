package com.java.groupProject;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        System.out.print("Task 3 ->");

        Scanner input = new Scanner (System.in);
        System.out.print("Enter number and I will calculate it by 9: ");

        int inpNum = input.nextInt();

        System.out.println(inpNum*=9);
    }
}
