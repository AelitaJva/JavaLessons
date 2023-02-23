package com.java.Practice.EasyCodingBAt;

import java.util.Scanner;

public class CigarParty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isSuccessful = cigarParty(sc);
        System.out.println(isSuccessful);
        // cigarParty(sc);

    }

    public static boolean cigarParty(Scanner sc) {
        System.out.println("Number of cigars?:");
        int numCigar = sc.nextInt();
        System.out.println("Is it weekend? True/False: ");
        boolean isWeekend = sc.nextBoolean();

        if (isWeekend) {
            return (numCigar >= 40);
        } else {
            return (numCigar >= 40 && numCigar <= 60);
        }
    }
}
