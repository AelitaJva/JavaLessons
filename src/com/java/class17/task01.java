package com.java.class17;

public class task01 {
    public static void main(String[] args) {
        // write a program to Print
        //  1 10 2 9 3 8 4 7 5 6

        int n = 1; // starting point
        int n2 = 10; // finish

        // () -> how many times it should run?
        // if your problems is asking to run specific
        // number of times
        // there should at least one var
        // <= -> I run it extra time

        while (n <= 5 && n2 >= 0) {  // n<=5 - run 5times
            // in the body of the while loop I must have
            // a boolean expression update

            System.out.println(n);
            System.out.println(n2);
            n++; // updating properly
            n2--; // updater
        }

        // 1. define the right starting point
        // 2. define a boolean expression where
        // u are using the  var of starting point
        // 3. write body of the while loop
        // 4. make sure u have updater of variable in
        // the boolean expression
    }
}
