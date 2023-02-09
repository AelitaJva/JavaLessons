package com.java.class24;

import java.util.Arrays;
import java.util.Scanner;

public class array_2d_ex1 {
    public static void main(String[] args) {

        int data [][] = {
                {3, 5, 7},
                {5, 7, 2},
                {6, 3, 1},
        };

//        for (int i=0; i<data.length; i++) {
//            for (int j=0; j<data[i].length; j++) {
//                System.out.print(data[i][j]);
//            }
//            System.out.println();
//        }

//        int sum = 0;
//        for (int i=0; i<data.length; i++) {
//            for (int j=0; j<data[i].length; j++) {
//                sum+=data[i][j];
//            }
//        }
//        System.out.println(sum);
        //int sum = 0;




//        for (int i= 0; i<data.length; i++) {
//            int sum = 0;
//
//            for (int j= 0; j<data.length; j++) {
//                sum+=data[i][j];
//            }
//
//            System.out.println("Some of row " + (i+1) +  " = " + sum);
//        }

//        int data1 [][] = new int [3][3];
//        Scanner sc = new Scanner(System.in);
//
//        for (int i=0; i<data1.length; i++) {
//            System.out.println("Enter 3 numbers for row " + (i+1));
//
//            for (int j=0; j<data[i].length; j++) {
//                data [i][j] = sc.nextInt();
//            }
//        }

        for (int i=0; i<data.length; i++) {
            int greatest = 0;
            for (int j=0; j<data[i].length; j++) {
                if(data[i][j] > greatest) {
                    greatest = data[i][j];
                }
            }
            System.out.print((i+1) + greatest);
        }

//        for (int i=0; i<data1.length; i++) {
//            for (int j= 0; j<data1[i].length; j++) {
//                System.out.print(data1[i][j]);
//            }
//            System.out.println();
//        }
    }
}
