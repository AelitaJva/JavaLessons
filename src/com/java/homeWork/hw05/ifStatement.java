package com.java.homeWork.hw05;

import java.util.Scanner;

public class ifStatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many exercises do you solve per day? ");

        int exercise = scan.nextInt();
        System.out.println("I solve: " + exercise);

        if (exercise < 3)
            System.out.println("You're too lazy!");
        else if(exercise >= 3 && exercise < 5)
            System.out.println("Good job, but you should do better!");
        else
            System.out.println("Great job! You are on the right track!!!");
    }
}
