package com.java.GroupProject.gp09;

import java.util.Arrays;

public class verifyArrays {
    public static void main(String[] args) {

        String[] arr1 = new String[]{"A", "B", "C"};
        String[] arr2 = new String[]{"A", "B", "C"};
        System.out.println("First Example: ");
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(areEqual(arr1, arr2));

        String[] arr3 = new String[]{"A", "B", "C"};
        String[] arr4 = new String[]{"C", "B", "A"};
        System.out.println("Second Example: ");
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));
        System.out.println(areEqual(arr3, arr4));

    }

    public static boolean areEqual (String [] array1, String [] array2) {

        for (int i=0; i<array1.length; i++) {

            for (int j=0; j<array2.length; j++) {
                if(array1[i] == array2[j]) {
                    return true;
                }
            }
        } return false;
    }
}
