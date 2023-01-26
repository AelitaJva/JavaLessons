package com.java.class18;

public class whileLoopExample {
    public static void main(String[] args) {
        int i = 1;
        //while (i <= 5 ) { // the value of i is always will be <= 5
                          // cause of this it will never return false and keep printing out 1
           // System.out.println(i);
       // }

        System.out.println("=======================================");

        while (i <= 5) {
            i++;                   // checking fisrt
            System.out.println(i); // print out after that if condition is true
                                   // i<= 5; output -> 5
        }

        System.out.println("====================================");

        while (i <=5) {
            System.out.println(i); // first output
            i++;                    // secondly check
                                    // output: 6
                                    // check output if it;s false output the last value and output it
        }

        System.out.println("================================================");

        while (i <= 5) {
            i++;        // the value of i will faile when it's 6
                           // will exit here
        }
        System.out.println(i); // output the last value


        System.out.println("=====================================================");

        while (i < 5) {
            i++;
            System.out.println(i); // 2-4
        }

        while (i < 5) {
            System.out.println(i); // 1-5
            i++;
        }

        System.out.println("=======================");

        while (i <= 5) {
            i++;
            if(i % 2== 0) {
                System.out.println("i is: " + i);
            }
            i++;
        }




        // TIP:
        // do iteration by yourself and after check by runnung
        // compare your answer with answer of Inteliji
        // use pan and paper
    }
}
