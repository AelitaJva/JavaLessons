package com.java.class25;

public class BankMain {
    public static void main(String[] args) {
        Bank anarAccount = new Bank();
        Bank anjelAccount = new Bank();
        anarAccount.balance = 1000;
        anarAccount.accountName = "Anara";

        anjelAccount.accountName = "Anjelina";
        anjelAccount.balance = 5000;


        anarAccount.withdraw(600);
        System.out.println(anarAccount.balance );

        anjelAccount.deposit(450);
        System.out.println(anjelAccount.balance);

    }
}
