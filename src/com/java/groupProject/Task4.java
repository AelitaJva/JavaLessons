package com.java.groupProject;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.print("The amount of your collecting money: ");

        int jake = input.nextInt();
        int phil = input.nextInt();
        int ryan = input.nextInt();
        int tom = input.nextInt();
        int bill = input.nextInt();
        int result = (jake + phil + ryan + tom + bill) / 5;
        System.out.println("Each daily Profit: " + result);

        System.out.println("================================");

        System.out.println("Jake's = " + jake);
        System.out.println("Phil's = " + phil);
        System.out.println("Ryan's = " + ryan);
        System.out.println("Tom's = " + tom);
        System.out.println("Bill's = " + bill);
    }
}
