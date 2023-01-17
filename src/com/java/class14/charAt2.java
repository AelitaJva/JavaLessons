package com.java.class14;

public class charAt2 {
    public static void main(String[] args) {
        // charAt( int i) -> returns a character at ith index

        String str = "wedevx.co";
        System.out.println(str.charAt(1)); //e
        System.out.println(str.charAt(5)); //x
        System.out.println(str.charAt(6)); //.

        String str2 = "Hello World";
        System.out.println(str2.charAt(5)); // space

        //String str3 = "Superstar";
        //System.out.println(str3.charAt(15)); // index out of bound
        // Exception are runtime errors
        // StringIndexOutOfBoundsException

        // practice
        String newMethod = "Practice";
        System.out.println(newMethod.charAt(7));


















    }
}
