package com.java.Practice.AlexLee;

import java.util.Scanner;

public class addingTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 number");
        int n1 = sc.nextInt();
        System.out.println("2 number");
        int n2 = sc.nextInt();

        int sum = n1 + n2;
        System.out.println(sum);

    }
}
