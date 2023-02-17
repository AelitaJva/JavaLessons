package com.java.HomeWork.hw10;

import java.util.Scanner;

public class nestedIfStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how much you want to loan: ");
        int loanAmount = sc.nextInt();

        System.out.println("Enter your credit score: ");
        int creditScore = sc.nextInt();

        if(loanAmount < 10000) {
            if(creditScore<600) {
                System.out.println("Your interest rate is 15%");
            } else if(loanAmount>=600) {
                System.out.println("Your interest rate is 10%");
            }
        } else if(loanAmount>=10000) {
            if(creditScore<600) {
                System.out.println("Your interest rate is 12%");
            } else if(creditScore>=600) {
                System.out.println("Your interest rate is 8%");
            }
        }
    }
}
