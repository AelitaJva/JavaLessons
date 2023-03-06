package com.java.Class34;
abstract class Bank {
    public abstract  void displayRateOfInterest ();
}

class CityBank extends Bank {
    public void displayRateOfInterest () {
        System.out.println("5.0");
    }
}

class ChaseBank extends Bank {
    public void displayRateOfInterest () {
        System.out.println("6.0");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
       //  Bank b = new Bank();
        //b.displayRateOfInterest();
    }
}
