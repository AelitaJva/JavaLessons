package com.java.class24;

import java.util.Arrays;

public class ex3 {
    public static void main(String[] args) {
        int data [] = {45, 56, 56, 7};

        System.out.println(Arrays.toString(data));

//
//        for (int i=0; i<data.length; i++) {
//            System.out.println(data[i]);
//        }


        for (  int temp          :    data        ) {
            System.out.println(temp);
        }
    }
}
