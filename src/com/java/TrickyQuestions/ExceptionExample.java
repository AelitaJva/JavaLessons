package com.java.TrickyQuestions;

public class ExceptionExample {
    public static void main(String[] args) {
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
        //catch (NumberFormatException e) {   // compilation error, exception must be in the lsat place
        System.out.println("Line 4");
        //   }
    }
}
