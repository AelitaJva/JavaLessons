package com.java.class24;

public class ex4_sumOfArraysElements {
    public static void main(String[] args) {
        int [][] num = {
                {1, 2, 3},
                {3, 4, 5},
                {6, 7, 8}
        };

        int sum = 0;
        for (int i=0; i<num.length; i++) {
            for (int j=0; j<num[i].length;j++) {
                sum+=num[i][j];
            }
            System.out.println("Sum of " + (i+1) + " row is " + sum);
        }
    }
}
