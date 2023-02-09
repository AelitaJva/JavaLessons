package com.java.class24;

public class smallestNumber {
    public static void main(String[] args) {
        int data[] = {43, 56, 2, 78, 32};


        int smallest = data [0];
        for (int temp : data) {
            if(temp < smallest) {
                smallest = temp;
            }
        }
        System.out.println("The smallest = " + smallest);
    }
}

