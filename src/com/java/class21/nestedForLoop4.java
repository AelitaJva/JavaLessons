package com.java.class21;

public class nestedForLoop4 {
    public static void main(String[] args) {

//        for ( int i = 1; i <= 5; i++) {    // i = row
//            for (int j = 1; j <= i; j++) { // j = column
//                System.out.println(j);
//            }
//           System.out.println();
//        }


//        for (int i = 1; i <= 5; i++) {               // row
//
//            for (int s = 1; s <= 5 - i; s++) {
//                System.out.print(" ");
//            }
//
//            for (int j = 1; j <= i; j++) {           // column
//                System.out.print(j);
//            }
//            System.out.println();
//        }


        for (int i=1; i<=5; i++) {       // column

            for (int s=1; s<=5-i; s++) {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++) {   // row
                System.out.print(i);
            }

            System.out.println();
        }

    }
}
