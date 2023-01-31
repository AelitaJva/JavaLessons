package com.java.class20;

public class hwRevise {
    public static void main(String[] args) {
        //   4.  Java program to Print sum of 1 + 2 - 3 + 4 + 5 - 6 + 7 + 8 - 9 + 10

        int sum = 0;

        for ( int i = 1; i <= 10; i++) {
           if ( i % 3 == 0) {
               sum = sum - i;
           } else {
               sum = sum + i;
           }
        }
        System.out.println(sum);


        System.out.println("=====================");

        // ex 2:
        // 6. Java program to find sum of 1^2 + 2^2 + 3^2 + 4^2 + 5^2
        int  sum1 = 0;
        for (int j = 1; j <= 5; j++) {
           // sum1 = sum1 + j * j;
            sum1 = sum1 + (int) Math.pow(j, 2);
        }
        System.out.println(sum1);



    }


}
