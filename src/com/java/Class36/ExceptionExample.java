package com.java.Class36;

public class ExceptionExample {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.length());
        } catch ( ArithmeticException e) {
            System.out.println("Something went wrong!");
        } catch (NullPointerException e) {
            System.out.println("Null Pointer");
        } catch (java.lang.Exception e) {
            System.out.println("Exception");
        }
    }
}
