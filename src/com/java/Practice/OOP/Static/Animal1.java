package com.java.Practice.OOP.Static;

class Animal {
    String name;
    int age;

    Animal (String name, int age) {
        this.name = name;
        this.age = age;
    }

    void eat () {
        System.out.println(this.name + " is eating");
    }

}

class Cat extends Animal {
    String color;

    Cat (String name, int age, String color) {
        super (name, age);
        this.color = color;
    }

    void meow () {
        System.out.println(this.name + " is meowing" + " and the color is " + this.color);
    }
}

class Dog extends Animal {

    Dog (String name, int age) {
        super(name, age);
    }

    void bark () {
        System.out.println(this.name + " is barking");
    }
}


public class Animal1 {
    public static void main(String[] args) {
        Cat cat1 = new Cat ("Tom", 2, "white");
        cat1.eat();
        cat1.meow();

        Dog d1 = new Dog("Johnty", 3);
        d1.bark();
        d1.eat();
    }
}
