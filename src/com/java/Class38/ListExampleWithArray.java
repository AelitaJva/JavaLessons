package com.java.Class38;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExampleWithArray {
    public static void main(String[] args) {
        List<Integer> listOfNumber = new ArrayList<>();
        listOfNumber.add(40);
        listOfNumber.add(34);
        listOfNumber.add(65);
        listOfNumber.add(32);
        listOfNumber.add(2, 50);
        System.out.println(listOfNumber);

        for (int i = 0; i < listOfNumber.size(); i++) {
            System.out.println(listOfNumber.get(i));
        }
        System.out.println("======================");

        for (int data : listOfNumber) {
            System.out.println(data);
        }

        System.out.println("======================");

        System.out.println(listOfNumber.contains(65));  // true

        // to remove all
//        listOfNumber.clear();
//        System.out.println(listOfNumber);


        Collections.sort(listOfNumber);
        System.out.println(listOfNumber);
        Collections.reverse(listOfNumber);
        System.out.println(listOfNumber);
    }
}
