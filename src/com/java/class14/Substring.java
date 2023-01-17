package com.java.class14;

public class Substring {
    public static void main(String[] args) {
        // substring (int i) = returns a String which a substring from  ith
        // to the end of original String

        String str = "Hello World";
        System.out.println(str.substring(6));
        System.out.println(str);
        //last time is equal to sign = to print full word = keywords

        String str1 = "Tesla Motors inc.";
        System.out.println(str1.substring(6));


        String str2 = "La Ferrari";
        System.out.println(str2.substring(3, 8));

        String str3 = "Maldive Island";
        System.out.println(str3.substring(0,7)); //Maldive

        // we can not go back
        //System.out.println(str3.substring(5,1));

        }
}
