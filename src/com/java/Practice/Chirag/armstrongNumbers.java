package com.java.Practice.Chirag;

import java.util.Scanner;

public class armstrongNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(armstrongNumber(sc));

    }

    public static boolean armstrongNumber (Scanner sc) {
        System.out.println("Which number do gonna check whether is armstrong or not? ");
        int number = sc.nextInt();
        int backUp = number;

        int sumOfDigit= 0;
        while (number > 0) {
            int eachDigit = number % 10;
            sumOfDigit+=eachDigit*eachDigit*eachDigit;
            number/=10;
        }

        System.out.println("Input: " + backUp);
        System.out.println("Output: " + sumOfDigit);

        boolean isItArmstrongNum = false;
        if (sumOfDigit == backUp) {
            isItArmstrongNum = true;
        } else {
            isItArmstrongNum = false;
        }

        return isItArmstrongNum;
    }
}
