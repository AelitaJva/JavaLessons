package com.java.GroupProject.gp09;

import java.util.Arrays;
import java.util.Scanner;

public class groceryTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(Arrays.toString(createList(sc)));

    }

    public static String[] createList (Scanner sc) {
        System.out.println("How many items do you want to add?");
        int numberOfItems = sc.nextInt();
        sc.nextLine();

        String [] listOfItems = new String[numberOfItems];
        for (int i=0; i<numberOfItems; i++) {
            System.out.println("Enter " + (i+1) + " item: ");
            listOfItems[i] = sc.nextLine();
        }

        return listOfItems;
    }
}
