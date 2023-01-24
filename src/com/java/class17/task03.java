package com.java.class17;

import java.util.Scanner;

public class task03 {
    public static void main(String[] args) {
        // task 3:
        // print out all char of a String
        // in reverse order


        // 1. define the right starting point
        // 2. define a boolean expression where
        // u are using the  var of starting point
        // 3. write body of the while loop
        // 4. make sure u have updater of variable in
        // the boolean expression

        Scanner sc = new Scanner(System.in);
        System.out.println("Please, input a String: ");
        String str = sc.nextLine();

        String reverse = " ";
        int j = str.length() - 1;

        while (j >= 0) {
            char eachChar = str.charAt(j);
            reverse = reverse + eachChar;
            j--;
        }
        System.out.println(reverse);

        // 2 approach
        String str1 = "language";
        int lengthOf = str1.length();

        while (lengthOf > 0) {
            lengthOf--;
            char reverseChar = str1.charAt(lengthOf);
            System.out.println(reverseChar);
        }


        //
        String news = "Obama";
        int index = news.length() - 1;
        System.out.println(index);

        while (index >= 0) {
            //System.out.println(news.charAt());
        }

    }
}
