package com.java.homeWork.hw05;

import java.util.Scanner;

public class ifStatement2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("To find the average of 3 numbers. Input numbers: ");

        int num1 = scan.nextInt();
        System.out.println("num1: " + num1);

        int num2 = scan.nextInt();
        System.out.println("num2: " + num2);

        int num3 = scan.nextInt();
        System.out.println("num3: " + num3);

        int averageNum = (num1+num2+num3) / 3;

        System.out.println("The average number is: " + averageNum);


    }
}
