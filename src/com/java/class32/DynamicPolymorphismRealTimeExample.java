package com.java.class32;

class Bank {
    void withdraw () {
        System.out.println("Parent withdraw");
    }

    void deposit () {
        System.out.println("Parent deposit");
    }

    void displayRateOfInterest () {
        System.out.println("Parent rate of Interest");
    }
}

class ChaseBank extends Bank {
    @Override
    void displayRateOfInterest () {
        System.out.println("Child rate of Interest");
    }

    void takeQuickLoan () {
        System.out.println("Child take quick loan");
    }
}

class CityBank extends Bank {
    @Override
    void displayRateOfInterest () {
        System.out.println("Child rate of interest - City bank");
    }
}

public class DynamicPolymorphismRealTimeExample {
    public static void main(String[] args) {
        // reference of Bank
       // Bank b = new ChaseBank();

        ChaseBank chiragCB = new ChaseBank();
        CityBank chiragCity = new CityBank();

        Paypal chiragPaypal = new Paypal();

        chiragPaypal.displayRateOfInterest(chiragCB);
        chiragPaypal.displayRateOfInterest(chiragCity);


    }
}
