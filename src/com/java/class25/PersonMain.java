package com.java.class25;

public class PersonMain {
    public static void main(String[] args) {
        // a: is a primitive data type - not object, is a variable
        int a = 10;

        // Create reference of class
        Person anara;

        // initialize memory for the object
        Person dana = new Person();
        Person anar = new Person ();
        System.out.println(dana.name);


        // declaration
        dana.age = 34;
        anar.age = 36;
        dana.name = "Danaker";
        anar.name = "Anara";

        System.out.println(dana.name);
        dana.run();
        anar.eat();


    }
}
