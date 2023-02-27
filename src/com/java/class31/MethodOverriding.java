package com.java.class31;


class Car {
    void drive () {
        System.out.println("Driving at speed of 100");
    }
}

class SportsCar extends Car {
    void drive () {
        System.out.println("Driving at speed of 180");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Car c = new Car ();
        SportsCar sc = new SportsCar();

        c.drive();
        sc.drive();
    }
}
