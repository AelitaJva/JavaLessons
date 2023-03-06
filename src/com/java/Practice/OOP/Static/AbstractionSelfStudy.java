package com.java.Practice.OOP.Static;

// abstract class
abstract class Animal7 {

    // abstract method - does not have a body
    public abstract  void animalSound ();

    // Regular method
    public void sleep () {
        System.out.println("Zzzz....");
    }
}

class Pig extends Animal7 {

    @Override
    public void animalSound() {
        // the body of animalSound (abstract method) is provided here
        System.out.println("The pig says: wee wee");
    }
}

public class AbstractionSelfStudy {
    public static void main(String[] args) {
        Pig myPig = new Pig(); // Create a Pig object
        myPig.animalSound();
        myPig.sleep();

    }
}
