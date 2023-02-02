package com.java.class21;

public class try1 {
    public static void main(String[] args) {
        // program to print below pattern
        /*
        * 12345
        * 12345
        * 12345
        * 12345
        * 12345
        * */

        for (int i=1; i<=5; i++) {      // row
            for (int j=1; j<=5; j++) {  // column
                System.out.print(j);    // print in one line
            }
            System.out.println();
        }
    }
}
