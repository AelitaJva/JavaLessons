package com.java.class28;

class Car1 {
    int speed;

    void drive () {
        System.out.println(speed);
    }
}

public class Car {
    public static void main(String[] args) {
        Car1 c = new Car1();
        c.drive();
    }
}
