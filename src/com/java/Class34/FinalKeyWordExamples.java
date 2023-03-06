package com.java.Class34;

class Parent {
    final void eat () {
        System.out.println("Mango");
    }
}

class Child {
    void eat () {
//        System.out.println("Mango");  // child don't have a choice
    }
}

public class FinalKeyWordExamples {
    public static void main(String[] args) {
        final int i=10;
       // i++; this will u error
        System.out.println(i);
    }
}
