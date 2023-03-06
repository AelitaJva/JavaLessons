package com.java.HomeWork.hw34;

abstract class Car {
    abstract void isFuelEnough ();
    void typesOfFuel () {
        System.out.println("You can choose: most cars run on gasoline or diesel fuel");
    }
    static void priceOfFuel () {
        System.out.println("The average price of gasoline is around $3.40 per gallon, diesel fuel is around $3.90 per gallon.");
    }
}

class Lexus extends Car {
    @Override
    void isFuelEnough() {
        System.out.println("The fuel of Lexus is now enough, doesn't need any fuel");
    }
}

public class AbstractionFinal {
    public static void main(String[] args) {
        Car myCar = new Lexus();
        myCar.isFuelEnough();
        myCar.typesOfFuel();
        myCar.priceOfFuel();

    }
}
