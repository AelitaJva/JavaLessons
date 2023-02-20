package com.java.Practice.OOP.Static;

class BankAccount2 {

    // instance variables
    String accountNumber;
    double balance;

    // constructor
    BankAccount2(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // instance method
    void deposit(int amount) {
        balance += amount;
    }

    // static method
    static boolean transfer(BankAccount2 fromTransfer, BankAccount2 toTransfer, double amount) {
        if (fromTransfer.balance < amount) {
            return false;
        }
        fromTransfer.balance-=amount;
        toTransfer.balance+=amount;
        return true;
    }
}

public class Bank2 {
    public static void main(String[] args) {
        BankAccount2 client1 = new BankAccount2("12345", 5000.0);
        BankAccount2 client2 = new BankAccount2("56789", 2000.0);

        System.out.println( "The balance of client 1 before transfer : " + client1.balance);
        System.out.println( "The balance of client 2 before transfer: " + client2.balance);

        boolean result = BankAccount2.transfer(client1, client2, 2500);

        if(result) {
            System.out.println("Successful transaction");
        } else {
            System.out.println("Failed");
        }

        System.out.println( "The balance of client 1 after transfer: " + client1.balance);
        System.out.println( "The balance of client 2 after transfer: " + client2.balance);

        client1.deposit(700);
        System.out.println("The balance of client 1 after deposit:" + client1.balance);

    }
}
