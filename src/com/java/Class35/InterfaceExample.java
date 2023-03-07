package com.java.Class35;

interface Bank {
    void displayRateOfInterest();

    void withdraw(int amount);

    void deposit(int amount);

}

interface InternationalBank extends  Bank{
    void displaySwiftCode ();
}

class CitiBank implements InternationalBank {

    @Override
    public void displayRateOfInterest() {

    }

    @Override
    public void withdraw(int amount) {

    }

    @Override
    public void deposit(int amount) {

    }

    @Override
    public void displaySwiftCode() {

    }
}

class ChaseBank implements Bank {

    @Override
    public void displayRateOfInterest() {

    }

    @Override
    public void withdraw(int amount) {

    }

    @Override
    public void deposit(int amount) {

    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        ChaseBank cb = new ChaseBank();
        cb.deposit(500);
    }
}
