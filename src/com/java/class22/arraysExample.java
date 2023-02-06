package com.java.class22;

import java.util.Arrays;

public class arraysExample {
    public static void main(String[] args) {
        // array is data type

        // create Array
        int listOfData [] = {10, 30, 50, 70, 40, 45, 32};                    // length counts from 1 = 7 indexes

        // print a data from the array
        System.out.println("taking just specific digit: " + listOfData[2]);
        System.out.println("the number of all digit: " + listOfData.length);


        for (int i=0; i<listOfData.length; i++) {                             // index starts from 0, and logic is just "<"
            System.out.println("all digit: ");
            System.out.println(listOfData[i]);
        }

        // prints the address of memory
        System.out.println("address of memory" + listOfData);


        // method inside the arrays = print the list of arrays as String
        System.out.println(Arrays.toString(listOfData));
    }
}
