package com.java.groupProject.gp03;

import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Your salary: ");
        int salary = sc.nextInt();
        System.out.println("Years of service: ");
        int yearsOfService = sc.nextInt();

        double bonus = 0;

        if (yearsOfService <= 3 && yearsOfService < 5) {
            bonus = (salary*0.03);
            System.out.println(bonus);
        } else if(yearsOfService < 5) {
            bonus = (salary*0.05);
            System.out.println(bonus);
        } else
            System.out.println(bonus);
    }
}
