package com.java.practice.Chirag;

import java.util.Scanner;

public class palindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(palindromeNumber(sc));
    }

    public static boolean palindromeNumber (Scanner sc) {
        System.out.println("Which number do you want to check whether is palindrome or not?");
        int num = sc.nextInt();
        int backUp = num;
        int reverseNum=0;

        while (num > 0) {
            int lastDigit = num % 10;
            reverseNum = reverseNum * 10 + lastDigit;
            num/=10;
        }

        System.out.println(backUp);
        System.out.println(reverseNum);

        boolean isItPalindrome = false;
        if(reverseNum == backUp) {
            isItPalindrome=true;
        } else {
            isItPalindrome=false;
        }

        return isItPalindrome;
    }
}
