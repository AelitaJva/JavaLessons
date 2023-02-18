package com.java.class27;

public class Bank {
    double balance;
    String accName;
    String accNum;

    // Parameterized constructor
    Bank (String accNameFromUser, String accNumFromUser) {
        accName = accNameFromUser;
        accNum = accNumFromUser;
    }

    // No argument constructor
    Bank () {
        System.out.println("From No Argument constructor");
    }


    // method
    void deposit (int amount) {
        System.out.println(accName + " is trying to deposit " + amount + " into " + accNum);
        balance = balance + amount;
    }

    void withdraw (int amount) {
        System.out.println(accName + " is trying withdraw " + amount + " from " + accNum);
        balance = balance - amount;
    }
}
