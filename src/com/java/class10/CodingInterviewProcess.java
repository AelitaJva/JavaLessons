package com.java.class10;

import java.util.Scanner;

public class CodingInterviewProcess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter number 1");
        int n1 = sc.nextInt();
        System.out.println("Please enter number 2");
        int n2 = sc.nextInt();
        System.out.println("Please enter number 3");
        int n3 = sc.nextInt();


        //first step: before we jump to pseudocode - we need to clarify any missing requirements:
        //can all numbers be equal? If yes what should be the output
        // -> yes, printOut all numbers are equal

        //what if 2 numbers are largest and equal? -> print out that number
        //is there a limit for numbers? no
        //ese only whole numbers? or decimal pointed number - whole numbers
        //can we compare negative numbers? - yes



        //pseudocode -> is the logic of a program
        //written in plain english.
        //I need to 3 integer numbers
        //My logic would like this
        // I need to tackle the numbers 1 by 1.

        //first let's write a logic where my n1 is the largest/
        //my n1 would the largest if it's bigger than n2 AND bigger than n3
        //so this is true than print out n1 is the largest number
        //if num1 is equal to num 2 and greater than num 3
        // then print out n1 and n2 are the greatest number
        //if num1==num2 &&num1>3 print out n1 and n2 are their greatest

        if(n1 >= n2 && n1 > n3 ) {
            System.out.println(n1 + " is the largest number");
        }
        //now I need check if the n2 is the largest
        //n2 is the largest if it's larger than n1 and larger than n3
        else if(n2 > n1 && n2 >= n3) {
            System.out.println(n2 + " is the largest number");
        }
        //lastly I need check if n3 is the largest
        //n3 is the largest if n3 is larger than n2 and n1.
        else if(n3 >= n1 && n3 > n2) {
            System.out.println(n3 + " is the largest number");
        }
        //if all numbers are equal printOut "equal numbers"
        else if(n3 == n1 && n3 == n2) {
            System.out.println("All numbers are equal");
        }
    }

    //general rule for debugging:
    //if you have the same exact body for multiple if statements it's bad
    //you can optimize your code by combining logics into one if statement
}
