package com.java.class24;

public class array_2d {
    public static void main(String[] args) {
        //int name [] [] = new int [3] [3];

        int name [][] = {
                {12, 12}, {14, 32}, {34, 64}
        };

        System.out.println(name.length);         // print out the number of rows in 2d arrays
        System.out.println(name[0].length);      // print out the number of columns in 2d arrays


        // print all data from 20 array?
        for (int i=0; i<name.length; i++) {
            for (int j=0; j<name[i].length; j++) {  // name[i] = each row
                System.out.println(name[i] [j]);
            }
        }
    }
}
