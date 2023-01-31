package com.java.class19;

import java.util.Scanner;

public class forLoop2 {
    public static void main(String[] args) {
        // 6 factorial result:
        //  6 / 1, 3, 6

        Scanner sc = new Scanner(System.in);
        System.out.println("Input a Number: ");
        int n = sc.nextInt();
        int f;

        for (f = 1; f <= n; f++) {
            if (n % f == 0) {
                System.out.println(f);
            }
        }


    }
}
