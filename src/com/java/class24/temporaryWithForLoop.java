package com.java.class24;

import java.util.Arrays;

public class temporaryWithForLoop {
    public static void main(String[] args) {
        int data [] = {45, 56, 56, 7};
        System.out.println(Arrays.toString(data));

        for (int temp:data) {
            System.out.println(temp);
        }
    }
}
