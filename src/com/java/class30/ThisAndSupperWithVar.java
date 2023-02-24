package com.java.class30;

class Parent {
    String name = "Azat";      // super.name
}

class Child extends Parent {
    String name = "Chirag";    // this.name

    void printName () {
        String name = "Maxim";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}


public class ThisAndSupperWithVar {
    public static void main(String[] args) {
        Child c = new Child();
        c.printName();
    }
}
