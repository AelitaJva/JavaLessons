package com.java.class23;

public class twoDimensionalArray {
    public static void main(String[] args) {
        // declaration of two dimensional array

        int data[][] = {
                {34, 54, 23},
                {34, 54, 23},
                {34, 54, 23}
        };


        // access one of the element from 20 array
        System.out.println(data [0][0]);


        // print all data
         for (int i=0; i<3; i++){
             for (int j=0; j<3; j++) {
                 System.out.print(data [i] [j] + "");
             }
             System.out.println();
         }


         // number of rows
        System.out.println(data.length);

         //find out number of column in arrays
        System.out.println(data[0].length);
    }
}

