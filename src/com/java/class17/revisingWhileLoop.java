package com.java.class17;

import java.util.Scanner;

public class revisingWhileLoop {
    public static void main(String[] args) {

        //
        Scanner in = new Scanner(System.in);
        System.out.println("Input a String ");

        String str = in.nextLine();
        int lastChar = str.length() - 1;
        while (lastChar >= 0) {
            System.out.println(str.charAt(lastChar));
            lastChar--;
        }

        //
//        String str1 = in.nextLine();
//        int index = str.length();
//
//        while (index >= 0) {
//            System.out.println(str1.charAt(index));
//            index++;
//        }
        System.out.println("====================================");

        //
        int indA = 1;
        int indB = 10;

        while (indA <= 5 && indB >= 0) {
            System.out.println(indA);
            System.out.println(indB);
            indA++;
            indB--;
        }
        System.out.println("=======================================");

        //
        System.out.println("Input a String: ");
        String word = in.nextLine();
        int indexOfWord = 0;

        while (indexOfWord < word.length()) {
            System.out.println(word.charAt(indexOfWord));
            indexOfWord+=2;
        }
        System.out.println("============================================");

        //
        String str3 = "Aelita";
        int starting = 0;
        while (starting < 7) {
            char charOf = str3.charAt(starting);
            System.out.println(charOf);
            starting++;
        }


    }
}
































