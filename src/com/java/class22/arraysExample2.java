package com.java.class22;

// write a code to print sum of data stored in the array

public class arraysExample2 {
    public static void main(String[] args) {
        int listOfData [] = {10, 30, 50, 70, 30, 40, 45, 32};
        int sum = 0;

        for (int i=0; i<listOfData.length; i++) {
            sum+=listOfData[i];
        }
        System.out.println(sum);
    }
}
