package com.java.Class34;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("Woof");
    }

    @Override
    void liveIn() {
        System.out.println("In  KG");
    }


}
