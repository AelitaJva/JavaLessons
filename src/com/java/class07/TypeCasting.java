package com.java.class07;

public class TypeCasting {
    public static void main(String[] args) {
        double gasPrice = 1.99;

        //  incompatible - things tah don't fit each other
        // trying to put decimal pointed numbers into whole number data type
        // when u trying to push in high numbers into small numbers


        //int wholeNumber = gasPrice; // incompatible types compilation error

       // int b = 10.5; // incompatible types compilation error

        int a = 4000000;
       // short smallNumber = a; // incompatible types compilation error

        // explicit type casting

        double price = 2.99;
        // (int) is a type casting operator
        int convert = (int) price;

        double num2 = 9.01;
        int convert2 = (int) num2;

        float floatNum = 2.4f;
        byte byteNum = (byte) floatNum;
        System.out.println(byteNum);
        // convert floatNum into to byte;
        // and print out byte number


        // implicit = automatic
        // explicit = manual (we type data types)

        // implicit
        int num1 = 24;
        double doubleNum = num1; // automatically adds .0 at the end
        System.out.println(doubleNum); // 24.0

        int num3 = 55;
        double doubleNum3 = num3;
        System.out.println(doubleNum3); // 55.0

        // I want to get Average customer Spending on my product
        // I sold $4,544,95.9
        // 64 - clients
        // find what is the average customer spending


        //ex1 = implicit
        // double + int = automatically convert into double
         double sold = 454495.96;
         int clients = 64;
         double average = sold/clients;
        System.out.println(average);

        //ex2
        // I drove 100 miles
        // gallons of gas = 2.4;
        // how many gallons per mile did I spend

        int miles = 100;
        double gallonsOfGas = 2.4;
        double spend = miles/gallonsOfGas;
        System.out.println(spend);















    }
}
