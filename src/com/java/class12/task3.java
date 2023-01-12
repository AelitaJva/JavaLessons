package com.java.class12;

import java.util.Scanner;

public class task3 {
    // create a function that returns us false or true and will let us know if we can sleepIn
    // it should take 2 param - one is weekday
    // second one to know if it is a vacation
    //we can sleep if it is not a weekday or we are on the vacation
    // return true if we sleep in


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean result = canISleep(4, true);
        System.out.println(result);

    }

    public static boolean canISleep(int dayOfWeek, boolean isOnVacation) {

        if (isOnVacation) {
            return true;

        } else {
            if (dayOfWeek <= 5) {
                return false;
            } else if (dayOfWeek == 6 || dayOfWeek == 7) {
                return true;
            } else {
                return false;
            }

        }
    }
}
