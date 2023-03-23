package com.java.Practice.John;

public class Encapsulation {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Aelita");
        person1.setAge(22);
        System.out.println("Printing out the meaning in the main method " + person1.getName());
        System.out.println("Printing out the meaning in the main method " + person1.getAge());
        person1.speak();
    }
}

class Person {
    private String name;
    private int age;

    public void setName(String userName) {
        if (userName.isEmpty()) {
            System.out.println("Empty name");
        } else {
            name = userName;
        }
    }

    public String getName() {
        return name;
    }

    public void setAge(int userAge) {
        if (userAge < 0) {
            System.out.println("Age should be positive number");
        } else {
            age = userAge;
        }
    }

    public int getAge() {
        return age;
    }

    void speak () {
        for (int i=0; i<3; i++) {
            System.out.println("My name is " + name + ", " + " I am " + age + " years old");
        }
    }
}
