package com.java.class24;

public class array_2d {
    public static void main(String[] args) {
        //int name [] [] = new int [3] [3];

        int [][] numbers = {
                {22, 33},
                {44, 55},
                {66, 77},
                {88, 99}
        };

        System.out.println("rows: " + numbers.length);            // the number of rows
        System.out.println("columns: " + numbers[0].length);         // the number of column

        // print out all rows and columns
        for (int i=0; i<numbers.length; i++) {         // rows
            for (int j=0; j<numbers[i].length; j++) {  // columns   // == numbers[i] -> each row
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
