package com.java.class10;

import java.util.Scanner;

public class nestedIFStatement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("1. Main Course");
        System.out.println("2. Appetizer");

        String ch1 = "Main course";
        String ch2 = "Appetizer";

        String choice1 = in.nextLine();
        String choice2 = in.nextLine();

        if(choice1.equalsIgnoreCase("Main course") || choice1.equals("1")) {
            System.out.println("Your choice is " + ch1);
            System.out.println("1. Lagman");
            System.out.println("2. New York  Rib ");

            String choiceMainCourse = in.nextLine();

            if (choiceMainCourse.equalsIgnoreCase("lagman") || choiceMainCourse.equals("1")) {
                System.out.println("Lagman ingredients");
            } else if(choiceMainCourse.equalsIgnoreCase("NYC steak") || choiceMainCourse.equals("2")) {
                System.out.println("NYC steak ingredients");
            }
        } else if (choice2.equalsIgnoreCase("Appetizer") || choice2.equals("2")) {
            System.out.println("Your choice is " + ch2);
            System.out.println("1. Spring rolls");
            System.out.println("2. Egg rolls");

            String choiceAppetizer = in.nextLine();

            if(choiceAppetizer.equalsIgnoreCase("Spring rolls") || choiceAppetizer.equals("1")) {
                System.out.println("Spring rolls ingredients");
            } else if(choiceAppetizer.equalsIgnoreCase("Eggs rolls") || choiceAppetizer.equals("2")) {
                System.out.println("Egg rolls ingredients");
            }
        }

    }
}
