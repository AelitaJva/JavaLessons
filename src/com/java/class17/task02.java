package com.java.class17;

public class task02 {
    public static void main(String[] args) {
        // write a program to print out all character in a String


        String str = "Let's go Mars";
        // do I know how many times my loop should be iterated?

        int startingIIndex = 0;

        // if u need to increment then use var <  how many times u need to run
        while (startingIIndex < 14) {
            char eachChar = str.charAt(startingIIndex);
            System.out.println(eachChar);
            startingIIndex++;
        }

        // 1. define the right starting point
        // 2. define a boolean expression where
        // you are using the  var of starting point
        // 3. write body of the while loop
        // 4. make sure u have updater of variable in
        // the boolean expression
    }
}
