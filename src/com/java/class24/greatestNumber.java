package com.java.class24;

import java.util.Scanner;

public class greatestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] data = new int [3][3];

        for (int i=0; i<data.length; i++) {
            System.out.println("Please, enter 3 numbers for row " + (i+1));
            int max = data [i][0];
            for (int j=0; j<data[i].length; j++) {
                data[i][j] = sc.nextInt();

                if (data [i][j] > max) {
                    max = data[i][j];
                }
            }
            System.out.println("The greatest number of row " + (i+1) + " is " + max);
        }

//        for (int i=0; i<data.length; i++) {
//            int greatest = 0;
//            for (int j = 0; j < data[i].length; j++) {
//                if(data[i][j] > greatest) {
//                    greatest = data[i][j];
//                }
//            }
//            System.out.println("The greatest number of row " + (i+1) + " is " + greatest);
//        }
    }
}
