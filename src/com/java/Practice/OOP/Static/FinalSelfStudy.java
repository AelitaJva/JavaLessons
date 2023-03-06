package com.java.Practice.OOP.Static;

class Main1 {
    final int x = 12;
}

public class FinalSelfStudy {
    public static void main(String[] args) {
        Main1 myObj = new Main1();
       // myObj.x = 25; // will generate an error: can not assign a value to a final variable
       // System.out.println(myObj.x);
    }
}
