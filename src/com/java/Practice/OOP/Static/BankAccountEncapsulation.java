package com.java.Practice.OOP.Static;

public class BankAccountEncapsulation {
    private int accountNumber;
    private double balance;
    
    public BankAccountEncapsulation (int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber () {
        return accountNumber;
    }

    public double getBalance () {
        return balance;
    }

    public void deposit (double amount) {
        balance+=amount;
    }

    public void withdraw (double amount) {
        if (balance>=balance) {
            balance-=amount;
        } else {
            System.out.println("Invalid value");
        }
    }
}
