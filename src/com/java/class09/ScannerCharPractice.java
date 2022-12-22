package com.java.class09;

import java.util.Scanner;

public class ScannerCharPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter Your Gender: ");

        char genderInCharType = sc.nextLine(). charAt(0);

//        String gender = sc.next();
//        char genderInCharType = gender.charAt(0);

        if(genderInCharType == 'm' || genderInCharType == 'm') {
            System.out.println("Go work hard");
        } else if (genderInCharType == 'F' || genderInCharType == 'f') {
            System.out.println("Enjoy your life");
        } else
            System.out.println("Something is wrong");
    }
}
