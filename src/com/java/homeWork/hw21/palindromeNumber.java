package com.java.homeWork.hw21;

import java.util.Scanner;

public class palindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int originNum = num;
        int reverseNum = 0;

        while (num != 0) {
            int lastDigit = num % 10;
            reverseNum = reverseNum * 10 + lastDigit;
            num/=10;
        }

        if(originNum == reverseNum) {
            System.out.println(originNum + " is a palindrome number");
        } else {
            System.out.println(originNum + " is not a palindrome number");
        }
    }
}
