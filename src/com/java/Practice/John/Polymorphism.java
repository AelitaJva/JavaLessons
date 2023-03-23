package com.java.Practice.John;

class Animal {
    public void eat() {
        System.out.println("Nyam nyam ");
    }

    public void eat(int numberOfTimes) {
        for (int i = 0; i < numberOfTimes; i++) {
            System.out.println("chomp chomp");
        }
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("Aww aww");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Dog myDog = new Dog();
        myAnimal.eat(3);
        myDog.eat();

    }
}
