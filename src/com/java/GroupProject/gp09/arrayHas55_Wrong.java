package com.java.GroupProject.gp09;

import java.util.Scanner;

public class arrayHas55_Wrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 numbers: ");
        int[] numbers = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};
        System.out.println(check(numbers));
    }

    public static boolean check(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i + 5] == 5 && i != numbers.length - 1) {
                if (numbers[i + 1] == 5) {
                    return true;
                }
            }
        }
        return false;
    }
}
