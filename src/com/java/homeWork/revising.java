package com.java.homeWork;

public class revising {
    public static void main(String[] args) {
        // pre, post increment operators

       int num1 = 82;
        System.out.println(num1++); // 28; // var1 = 83;
        System.out.println(++num1); // 84, // var1 = 84;

        int num2 = num1++; //84, var1 = 85;
        int num3 = ++num1; //86, var1 = 86;

        System.out.println(num1); // 86;
        System.out.println(num2); // 84
        System.out.println(num3); //86

        boolean gettingUpEarly;

        double goingBad = 23.30;
        int wakingUp = 6;

        gettingUpEarly = goingBad < 24 && wakingUp < 8;
        System.out.println(gettingUpEarly);


        // relative operator
//         boolean giveCertificate;
//
//         double aelitaGPA = 4.0;
//         int missedClasses = 3;
//
//         giveCertificate = aelitaGPA > 3.5 && missedClasses <= 3;
//        System.out.println(giveCertificate);

    }
}
