package com.java.practice.Easy;

public class task03 {
    public static void main(String[] args) {
        String w1 = "This is exercise 1";
        String w2 = "This is exercise 2";
        System.out.println(w1.compareTo(w2));
        System.out.println(w1.concat(w2));
        System.out.print(compare(w1, w2));
    }

    public static String compare(String w1, String w2) {
        if (w1.charAt(w1.length() - 1) > w2.charAt(w2.length() - 1)) {
            System.out.println("First is bigger");
            return w1;
        } else
            System.out.println("Second is bigger");
        return w2;
    }

}
