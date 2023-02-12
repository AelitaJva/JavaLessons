package com.java.class24;

import java.util.Scanner;

public class pr2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        bbb(sc);
    }

    public static void bbb(Scanner sc) {
        int [][] numbers = new int[3][3];

        for (int i=0; i<numbers.length; i++) {
            System.out.println("Enter numbers for the " + (i+1) + " row");
            int max = numbers [i][0];

            for (int j=0; j<numbers[i].length; j++) {
                numbers [i][j] = sc.nextInt();

                if(numbers[i][j] > max) {
                    max= numbers[i][j];
                }
            }
            System.out.println("The greatest number of " + (i+1) + " is " + max);
        }
    }
}
