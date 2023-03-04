package com.java.Practice.OOP.Static;
class Person {
    private String name;
    private int age;

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getAge () {
        return age;
    }

    public void setAge (int age) {
        this.age = age;
    }
}

public class EncapsulationWithGetterAndSetter {
    public static void main(String[] args) {
        Person person = new Person ();
        person.setName("Aelita Jelden");
        person.setAge(22);
        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}
