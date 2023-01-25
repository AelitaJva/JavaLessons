package com.java.class17;

public class NewClassForLoop {
    public static void main(String[] args) {
        String str = "kayak";
        String strRev = " ";
        int length = str.length()-1;

        while (length >= 0) {
            strRev = strRev + str.charAt(length);
            length--;
        }
        System.out.println("Entered String is: " + str);
        System.out.println("Reverse of the word is: " + strRev );


        if( strRev == str) {
            System.out.println("String is a palindrome");
        }
        else {
            System.out.println("String is not a palindrome");
        }

    }
}
