package com.java.class27;

class Demo {
    Demo() {
        System.out.println("From Constructor");
    }

    void Demo () {
        System.out.println("From the Method");
    }
}

public class ConstructorExample {
    public static void main(String[] args) {
        Demo d = new Demo(); // runs


        // d.Demo(); -- error
        // Here Java see this calling as a method from the Class
        // but we don't have any method called Demo in the Class
        // Demo method isn't exist in thr Class
        // therefore it returns error


        // created method in the Class and calling it now
        d.Demo();
    }
}
