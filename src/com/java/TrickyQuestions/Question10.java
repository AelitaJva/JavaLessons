package com.java.TrickyQuestions;

class Car {
    static int count;

    Car () {
        count++;
    }

    void printCount () {
        System.out.println(count);
    }
}

public class Question10 {
    public static void main(String[] args) {

        Car c1 = new Car ();
        Car c2 = new Car ();
        Car c3 = new Car ();
        Car c4 = new Car ();
        Car c5 = new Car ();

        c2.printCount();
        c3.printCount();

    }
}
