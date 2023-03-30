package com.java.Class39;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> ageOfPeople = new HashMap<>();

//        ageOfPeople.put("Dana", 43);
//        ageOfPeople.put("Dana", 13);
//        ageOfPeople.put("Askar", 53);
//        ageOfPeople.put("Islam", 25);
//        ageOfPeople.put("Asel", 37);
//
//        System.out.println(ageOfPeople);
//        System.out.println(ageOfPeople.get("Dana"));
//        System.out.println(ageOfPeople.size());
//        System.out.println(ageOfPeople.isEmpty());
//        System.out.println(ageOfPeople.containsKey("Dana"));
//        System.out.println(ageOfPeople.containsValue(43));

        ageOfPeople.put("Adelina", 100);
        ageOfPeople.put("Anjelina", 78);
        ageOfPeople.put("Askar", 98);
        ageOfPeople.put("Islam", 89);
        ageOfPeople.put("Asel'", 78);

        System.out.println(ageOfPeople);
    }
}
