package com.java.class21;

public class nestedForLoop3 {
    public static void main(String[] args) {
        // print out below pattern
        /*
        * 1
        * 12
        * 123
        * 1234
        * 12345
        * */



        for (int i=1; i<=5; i++) {         // column

            for (int j=1; j<=i; j++) {     //  row          // "j" execution depends on "i"
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
