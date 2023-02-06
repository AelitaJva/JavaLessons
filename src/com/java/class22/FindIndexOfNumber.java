package com.java.class22;

// 70 = index is 4
// check it

public class FindIndexOfNumber {
    public static void main(String[] args) {
        int listOfData [] = {10, 30, 50, 70, 30, 40, 45, 32};
        int targetNumber = 70;
        int index = -1;

        for (int i=0; i<listOfData.length; i++) {     // length start from 1
            if(listOfData[i] == targetNumber) {
                index=i;
                break;
            }
        }

        if(index != -1) {
            System.out.println("Index of " + targetNumber + " is " + index);
        } else {
            System.out.println("Index not found");
        }
    }
}
