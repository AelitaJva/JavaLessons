package com.java.HomeWork.hw10;

import java.util.Scanner;

public class nestedIfStatement01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1.Appetizer");
        System.out.println("2.Main course");
        System.out.println("3.Drinks");
        String ch1 = sc.nextLine();

        if(ch1.equalsIgnoreCase("Appetizer") || ch1.equals("1")) {
            System.out.println("Your choice is Appetizer: ");
            System.out.println("1.Spring rolls");
            System.out.println("2.Egg rolls");

            String choiceAppetizer = sc.nextLine();

            if(choiceAppetizer.equalsIgnoreCase("Spring Rolls") || choiceAppetizer.equals("1")) {
                System.out.println("Spring rolls ingredients");
            } else if(choiceAppetizer.equalsIgnoreCase("Egg rolls") || choiceAppetizer.equals("2")) {
                System.out.println("Egg rolls ingredients");
            } else {
                System.out.println("Invalid choice");
            }
        } else if(ch1.equalsIgnoreCase("Main course") || ch1.equals("2")) {
            System.out.println("Your choice is Main course: ");
            System.out.println("1.Plov");
            System.out.println("2.NYC Eye steak");

            String choiceMainCourse = sc.nextLine();

            if(choiceMainCourse.equalsIgnoreCase("Plov") || choiceMainCourse.equals("1")) {
                System.out.println("Plov ingredients");
            } else if(choiceMainCourse.equalsIgnoreCase("NYC steak") || choiceMainCourse.equals("2")) {
                System.out.println("NYC Eye steak ingredients");
            } else {
                System.out.println("Invalid");
            }
        } else if(ch1.equalsIgnoreCase("Drinks") || ch1.equals("3")) {
            System.out.println("Your choice is Drinks ");
            System.out.println("1.Orange juice");
            System.out.println("2.Pineapple juice");
            System.out.println("3.Apple juice");

            String choiceDrinks = sc.nextLine();
            if(choiceDrinks.equalsIgnoreCase("Orange juice") || choiceDrinks.equals("1")) {
                System.out.println("Orange juice ingredients");
            } else if(choiceDrinks.equalsIgnoreCase("Pineapple juice") || choiceDrinks.equals("2")) {
                System.out.println("Pineapple juice ingredients");
            } else if (choiceDrinks.equalsIgnoreCase("Apple juice") || choiceDrinks.equals("3")) {
                System.out.println("Apple juice ingredients");
            }
        }

    }
}
