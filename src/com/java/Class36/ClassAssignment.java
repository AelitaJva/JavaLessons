package com.java.Class36;

public class ClassAssignment {
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4};
        String str = null;

        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Null pointer");
        }
        try {
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Arrays out of bounds ");
        } catch (java.lang.Exception e) {
            System.out.println("Exception");
        } finally {
            System.out.println("I am always executed");
        }
    }
}
