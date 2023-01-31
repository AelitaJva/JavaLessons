package com.java.homeWork.hw19;

public class task04 {
    public static void main(String[] args) {
        // 4.  Java program to Print sum of 1 + 2 - 3 + 4 + 5 - 6 + 7 + 8 - 9 + 10

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                sum = sum - i;
            } else {
                sum = sum + i;
            }
        }
        System.out.println(sum);

        System.out.println("=================");

        // ex 5:
        // 5.  Java program to find sum of 10 + 1 + 9 + 2 + 8 + 3 + 7 + 4 + 6 + 5
        int sum1 = 0;
        for (int n = 1, m = 10; n <= 5; n++, m--) {
            sum1 += n + m;
            //sum1 = sum1 + n + m;
        }
        System.out.println(sum1);

    }
}
