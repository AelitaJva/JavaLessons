package com.java.HomeWork.hw12;

import java.util.Scanner;

public class task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your grade: A, B, C, D");
        char grade = sc.nextLine().charAt(0);
        System.out.println(passing(grade));
    }

    public static boolean passing(char grade) {
        if (grade == 'A' || grade == 'B') {
            return true;
        } else if (grade == 'B' || grade == 'C') {
            return false;
        }
        return false;
    }
}
