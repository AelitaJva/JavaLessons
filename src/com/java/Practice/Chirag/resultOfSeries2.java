package com.java.Practice.Chirag;

public class resultOfSeries2 {
    public static void main(String[] args) {
        // 1/2 + 2/3 + 3/4 + 5/6 + 6/7 + 8/9 + 9/10 + 10/11

        double sum = 0;
        for (double i = 1, j = 2; i <= 10; i++, j++) {
            sum += i / j;
        }
        System.out.println(sum);
    }
}
