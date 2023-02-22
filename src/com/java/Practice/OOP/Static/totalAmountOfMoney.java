package com.java.Practice.OOP.Static;

class BankAccount3 {
    double balance;
    static double totalBalance = 0;

    // instance methods
    void deposit(double amount) {
        balance += amount;
        totalBalance += amount;
    }

    // instance methods
    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            totalBalance -= amount;
        } else {
            System.out.println("Not enough money in your balance");
        }
    }

    double getBalance () {
        return balance;
    }


    // static method
    static double getTotalBalance () {
        return totalBalance;
    }
}

public class totalAmountOfMoney {
    public static void main(String[] args) {
        BankAccount3 cl5 = new BankAccount3();
        BankAccount3 cl1 = new BankAccount3();
        cl5.withdraw(700);
        double balance5 = cl5.getBalance();
        double totalBalance = BankAccount3.getTotalBalance();


        System.out.println("Balance: " + balance5);
        System.out.println("Total Balance: " + totalBalance);

        System.out.println("=====================");

        cl1.deposit(7000);
        double balance1 = cl1.getBalance();
        double totalBalance1 = BankAccount3.getTotalBalance();
        System.out.println("Balance: " + balance1);
        System.out.println("Total Balance: " + totalBalance1);


    }
}
