package com.java.GroupProject.gp06;

import java.util.Scanner;

public class concatenation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the first String: ");
        String str = sc.nextLine();
        System.out.println("Input the second String: ");
        String str2 = sc.nextLine();


        concatenation wVar = new concatenation();
        System.out.println("The given numbers are: " + str + "and" + str2);
        System.out.println(wVar.concatWords(str,str2));
    }

    public String concatWords(String str, String str2) {
        if (str.length() - 1 == str2.charAt(0)) {
            return str + str2.substring(1);
            //System.out.println(str + str2.substring(1));
        } else {
            return str.concat(str2);
            //System.out.println(str.concat(str2));
        }
    }
}
