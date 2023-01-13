package com.java.GroupProject.gp02;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Your salary: ");
        int salary = input.nextInt();

        int bonus = (salary * 10) / 100;
        System.out.println("Your bonus: " + bonus);

        int totalSalary = bonus + salary;

        System.out.println("Your total salary: " + totalSalary);

    }
}
