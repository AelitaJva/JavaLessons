package com.java.Class38;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set <String> fruits = new HashSet<>();

        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Potato");
        fruits.add("Banana");
        fruits.add("Mango");

        for(String fruit : fruits) {
            System.out.println(fruits);
        }
    }
}
