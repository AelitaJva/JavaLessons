package com.java.class06;

public class ConditionalOR {
    public static void main(String[] args) {
        // && -> both of them must be true
        // || -> one of them maust be true

        int age =  22;

        boolean discountAge = age < 82 || age > 21;
        System.out.println(discountAge);

        //if 24 hr time
        int currentTime = 13;

        //drink coffee should be true if current time id 6-11
        boolean drinkCoffee = currentTime > 5 || currentTime < 12;
        System.out.println(drinkCoffee);


        // tell me when I can start to relax
        //when u completed 5 java exercises
        // or when u recorded 2 soft-skills videos


        int howManyJavaEx = 5;
        int howManySoftSkillEx = 1;
        boolean canIRelaxNow = howManyJavaEx >= 5 || howManySoftSkillEx > 2;
        System.out.println(canIRelaxNow);
        System.out.println("==============================");

        // banking industry app
        // when should the bank account be blocked?
        // loginAttempts more than 3
        // transaction amout is more than $3000
        // location of transaction -> must match your current location


        // actual value that user input it
        int numberofLoginAttempts = 0;
        double transactionOfAmount = 0.0;
        String locationOfTransaction = "KG";

        // there is any limits to use logics
        // here is requirements: 3, 3000, USA
        boolean block = numberofLoginAttempts > 3 || transactionOfAmount > 3000 || locationOfTransaction == "USA";
        System.out.println(block);


        // strings
        // u can store text in a String in data type
        // u can inly compare strings with ==. !=
        // u can not do >, < ,>=, <=





    }

}
