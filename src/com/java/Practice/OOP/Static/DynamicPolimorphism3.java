package com.java.Practice.OOP.Static;
class Animal3 {
    void makeSound () {
        System.out.println("The animal makes a sound");
    }
}

class Dog3 extends Animal3 {
    void makeSound () {
        System.out.println("The dog barks");
    }
}

class Cat3 extends Animal3 {
    void makeSound () {
        System.out.println("The cat meows");
    }
}

class DynamicPolymorphism3 {
    public static void main(String[] args) {
        Animal3 myAnimal;

        myAnimal = new Dog3();
        myAnimal.makeSound();
        myAnimal = new Cat3();
        myAnimal.makeSound();


    }
}
