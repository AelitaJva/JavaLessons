package com.java.homeWork.hw24;

public class sumOfArrays {
    public static void main(String[] args) {
        int [] num = {12, 23, 34};

        for (int i=0; i< num.length; i++) {
            num[i] = i+5;
            System.out.println(num[i]);
        }

    }
}
