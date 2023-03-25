package com.java.TrickyQuestions;

public class ExceptionExample2 {
    public static void main(String[] args) {
        int a [] = {12, 17, 43};

        try {
            System.out.println(a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Arrays out of Bounds");
        }
        finally {
            System.out.println("End");
        }
    }
}
