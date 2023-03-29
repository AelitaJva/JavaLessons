package com.java.Class38;

import java.util.ArrayList;
import java.util.List;

public class ClassAssignment {
    public static void main(String[] args) {
        List<String> listOfFruit = new ArrayList<>();
        listOfFruit.add("Banana");
        listOfFruit.add("Mango");
        listOfFruit.add("Grapes");
        listOfFruit.add("Watermelon");
        listOfFruit.add("Kiwi");
        System.out.println(listOfFruit);
       // listOfFruit.remove("Mango");
        listOfFruit.remove(1);
        listOfFruit.contains("Banana");
        System.out.println(listOfFruit.contains("Banana") + " - The list contains Banana");

        System.out.println(listOfFruit + " here Mango removed from the list");
    }
}
