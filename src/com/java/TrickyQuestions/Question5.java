package com.java.TrickyQuestions;

public class Question5 {
    public static void main(String[] args) {
        int a = 10, b = 11, c = 10;

        if(a <= b) {
            if(b <= a) {
                System.out.println("Statement 1");
            } else if (c <= a) {
                System.out.println("Statement 2");
            }
        } else {
            System.out.println("Statement 3");
        }
    }
}
