package com.java.Practice.John;

public class Abstraction {
    public static void main(String[] args) {
        Cat cat = new Cat ();
        Dog2 dog = new Dog2();
        dog.makeSound();
        cat.makeSound();
        cat.eat();
        dog.eat();

    }
}
