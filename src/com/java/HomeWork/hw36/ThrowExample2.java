package com.java.HomeWork.hw36;

public class ThrowExample2 {
    public static void main(String[] args) {
        int a = 10, b = 0;
        div(a, b);

    }

    // answer: "Exception" is checked  exception, so it doesn't work
    // without being handled  with "try-catch" or
    // or declared with "throws" in the method signature
    static void div(int a, int b)  {
        if(b == 0) {
            //throw new Exception("Division can not be performed");
        } else {
            System.out.println("Answer: " + a / b);
        }
    }
}
