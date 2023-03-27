package com.java.HomeWork.hw35;

public class TryCatchExample2 {
    public static void main(String[] args) {

        // answer: gives error: bc Exception statement has to go last
        // after that another proper Exception can not execute
        int a[] = {10, 20, 30};
        int i = 5, j = 0;

        try {
            System.out.println(a[3]);
            System.out.println(i / j);
        } catch (ArithmeticException e) {
            System.out.println("Line 1");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Line 2");
        } catch (Exception e) {
            System.out.println("Line 3");
        }
        //catch (NumberFormatException e) {
        //    System.out.println("Line 4");
        //}
    }
}
