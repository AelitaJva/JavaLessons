package com.java.class31;

class Bank {
    void displayRateInterest (int amount) {
        System.out.println(amount);
    }

    void displayRateInterest (String amount) {
        System.out.println(amount);
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Bank c = new Bank();
        c.displayRateInterest(100);
    }
}
