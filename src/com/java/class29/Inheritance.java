package com.java.class29;

class Calculator {
    void add (int a, int b) {
        System.out.println(a + b);
    }

    void sub (int a, int b) {
        System.out.println(a - b);
    }
}

class AdvanceCalculator extends Calculator {
    void mul (int a, int b) {
        System.out.println(a * b);
    }

    void div (int a, int b) {
        System.out.println(a / b);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(10, 20);
        c.sub(40, 20);

        AdvanceCalculator cd = new AdvanceCalculator();
        cd.div(6, 2);
        cd.mul(6, 2);
        cd.sub(6, 2);
        cd.add(6, 2);
    }

}
