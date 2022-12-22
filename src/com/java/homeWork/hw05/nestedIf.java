package com.java.homeWork.hw05;

public class nestedIf {
    public static void main(String[] args) {
        // false {} statements scope {} -> is outer if statement
        // if line 12 if statement is false
//        if () {
//            if () {
//
//            }
//        }

        boolean outerBoolean = true;
        boolean innerBoolean = false;

        //this program wanr print out anything because
        // first if is true
        // second if is false

        //1
        if(true) {
            if(false) {
                System.out.println("Hi from Inner Statement");
            }
        }

        //2
        if(true) {
            if(true) {
                System.out.println("Hi from Inner Statement 2");
            }
        }

        // 3
        if(false) {
            if(true) {
                System.out.println("Hi 3");
            }
        }

        //4
        if(true) {
            if(true) {
                System.out.println("Hi 4");
            }
            System.out.println("Outer Hi 4");
        }



        // 5
        if(true) {
            System.out.println("Outer Hi 5.1");
            if(true) {
                System.out.println("Inner Hi 5");
            }
            System.out.println("Outer Hi 5.2");
        }

        // 6
        if (true) {
            System.out.println("Outer Hi 6/1");
            if(false) {
                System.out.println("Inner Hi 6");
            }
            System.out.println("Outer 6.2");
        }

        //7
        if (false) {
            System.out.println("Outer Hi 6/1");
            if(false) {
                System.out.println("Inner Hi 6");
            }
            System.out.println("Outer 6.2");
        }












    }
}
