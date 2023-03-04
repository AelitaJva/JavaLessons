package com.java.Practice.OOP.Static;

public class BankAccountEncapsulationMain {
    public static void main(String[] args) {
        BankAccountEncapsulation account = new BankAccountEncapsulation(12345, 1000.0);
        System.out.println("Account number: " + account.getAccountNumber());
        System.out.println("Initial balance: " + account.getBalance());
        account.deposit(600);
        System.out.println("New balance after deposit: " + account.getBalance());
        account.withdraw(100);
        System.out.println("New balance after withdrawal: " + account.getAccountNumber());
    }
}
