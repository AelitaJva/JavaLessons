package com.java.class15;

public class replacePractice02 {
    public static void main(String[] args) {

        // write a program that updates the first in the second word
        // to x
        String str = "DevX Adventure World";

        // space
        int indexOfFirstSpace = str.indexOf(" ");
        System.out.println(indexOfFirstSpace);
        // Adventure world
       String noDevX = str.substring(indexOfFirstSpace).replace('e', 'E');

       //DevX
       String DevXOnly = str.substring(0, indexOfFirstSpace);

       String result = DevXOnly.concat(noDevX);
        System.out.println(result);



    }
}
