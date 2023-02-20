package com.java.Practice.OOP.Static;

class BankAccount {
    // instance variables
    String accountNumber;
    double balance;

    // constructor
    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // instance method
    void deposit(double amount) {
        balance += amount;
    }

    // static method
    static boolean transfer(BankAccount fromAccount, BankAccount toAccount, double amount) {
        if (fromAccount.balance < amount) {
            return false;
        }
        fromAccount.balance -= amount;
        toAccount.balance += amount;
        return true;
    }
}
public class Bank {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("12345", 1000.0);
        BankAccount account2 = new BankAccount("67890", 2000.0);

        System.out.println("Account 1 balance before transfer: " + account1.balance);
        System.out.println("Account 2 balance before transfer: " + account2.balance);

        boolean result = BankAccount.transfer(account1, account2, 500.0);
        if (result) {
            System.out.println("Succeed");
        } else {
            System.out.println("Failed");
        }

        System.out.println("Account 1 balance after transfer: " + account1.balance);
        System.out.println("Account 2 balance after transfer: " + account2.balance);

        account1.deposit(100.0);
        System.out.println("Account 1 balance after deposit: " + account1.balance);


    }
}
