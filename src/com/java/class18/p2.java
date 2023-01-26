package com.java.class18;

public class p2 {
    public static void main(String[] args) {

        int i = 1;
        while (i <= 10) {
            if(i % 3 == 0) {
                i = i + 2;
            }
            i++;
            System.out.println(i); // 1,3,6,9,12
        }


        //
        while ( 1 <= 10) {
            System.out.println(i);
            if(1 % 3 == 0) {
                i--;
            } else if( i % 2 == 0) {
                i = i + 2;
            } else  {
                i++;
            }
            i++; // 1 3333333333333333333.....
        }



    }
}
