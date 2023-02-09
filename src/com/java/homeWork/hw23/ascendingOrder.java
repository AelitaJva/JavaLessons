package com.java.homeWork.hw23;

import java.util.Arrays;
import java.util.Scanner;

public class ascendingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers: ");

        int numbers [] = new int[5];
        for (int i=0; i<5; i++) {
            numbers[i] = sc.nextInt();
        }
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));






       // ascendingOrder(numbers);
    }

//    public static void ascendingOrder (int [] numbers) {
//        int greater;
//        for (int i=0; i<numbers.length; i++) {
//            for (int j=i+1; j<numbers.length; j++) {
//                if(numbers[i] > numbers[j]) {
//                    greater = numbers[i];
//                    numbers[i] = numbers[j];
//                    numbers[j] = greater;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(numbers));
//    }
}
