package com.java.class36;
class Person {
    String name;
    int age;
   // String phoneNumber;

    Person (String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class PassingObjectExample {
    public static void main(String[] args) {
        Person aizhan = new Person ("Aizhan", 17);
        Person dana = new Person ("Dana", 20);
        Person madina = new Person ("Madina", 23);

        printObjectData(aizhan);
        printObjectData(dana);
        printObjectData(madina);

    }

    // aizhan, dana, madina are object of Person
    public static void printObjectData (Person p) {
        System.out.println(p.age);
        System.out.println(p.name);
        //System.out.println(p.phoneNumber);
    }
}
