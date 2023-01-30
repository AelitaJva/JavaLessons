package com.java.class19;

public class forLoopExample {
    public static void main(String[] args) {

        int i = 1; // 1.initialization
        while (i <= 5) { // 2.condition
            System.out.println(i);
            i++; // 3.increment / decrement
        }


        // for loop
        // ex 2:
        for (int j = 10; j <= 15; j++) {
            System.out.println(j);
        }


        // ex 3:
        System.out.println("==============");
        for (int a = 10; a >= 1; a--) {
            System.out.println(a);
        }

        // ex 4:
        System.out.println("==============");
        for (int k = 1; k <= 10; k++) {
            System.out.println(k + 1); // 2, 3, 4, 5, 6, 7,8,9,10,11
        }

        // ex 5:
        System.out.println("==============");
        for (int l = 1; l <= 10; ) {
            l++;
            System.out.println(l + 1);
        }


        // ex 6:
        System.out.println("==============");

        for (int z = 1; z <= 10; z++) { // the value of var is declared inside the loop
            // so we can use it outside the loop

        }
        //System.out.println(z); // outside == doesn't work


        //ex 7:
        int z;
        for (z = 1; z <= 10; z++) {

        }
        System.out.println(z); // 11, because it prints out the last result
                               // when it was 11 = was false and here quit the process


        // ex 8:
        System.out.println("==============");

    }
}
