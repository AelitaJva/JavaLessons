package com.java.Class39;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        List<Integer> numbers = new ArrayList<>();


        // Take data from user
        System.out.println("Input five numbers: ");
        for (int i = 0; i< 5; i++) {
            numbers.add(sc.nextInt());
        }

        // Sort the data and print
        Collections.sort(numbers);
        System.out.println(numbers);
    }

}
