package com.java.Class34;

public abstract class Animal {
    private String name;

    Animal(String name) {
        this.name = name;
    }

    final String getName () {
        return this.name;
    }

    void info () {
        System.out.println("Here some type of animals: ");
    }

    abstract void makeSound();

    abstract void liveIn();
}
