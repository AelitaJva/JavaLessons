package com.java.class27;

public class BankM {
    public static void main(String[] args) {

        // 1.No argument constructor
        Bank acc2 = new Bank();

        System.out.println("========================");

        // 2.Parameterized constructor
        Bank acc1 = new Bank("Aelita", "12345");
        acc1.deposit(7000);
    }
}
