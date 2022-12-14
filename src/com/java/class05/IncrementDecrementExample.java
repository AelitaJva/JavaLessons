package com.java.class05;

public class IncrementDecrementExample {
    public static void main(String[] args) {

        int var1 = 30;
        System.out.println(var1++); //30, var1 = 31;
        System.out.println(++var1); //32, var1 = 32;

        int var2 = var1++; // var2 = 32, var1 = 33;
        int var3 = ++var1; //var3 = 34, var1 = 34;

        System.out.println(var1); //34
        System.out.println(var2); //32
        System.out.println(var3); //34

    }
}
