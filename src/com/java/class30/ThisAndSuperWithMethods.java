package com.java.class30;

class Bank {
    void displayRateOfInterests() {
        System.out.println("4.0%");
    }
}


class ChaseBank extends Bank{
    void displayRateOfInterests() {
        System.out.println("6.0%");
        // displayRateOfInterests();  // infinite loop
        super.displayRateOfInterests();
    }
}


public class ThisAndSuperWithMethods {
    public static void main(String[] args) {
        ChaseBank c = new ChaseBank();
        c.displayRateOfInterests();
    }
}
