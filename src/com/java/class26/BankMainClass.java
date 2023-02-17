package com.java.class26;

public class BankMainClass {
    public static void main(String[] args) {
        Bank acc1 = new Bank("Aelita", "12345");
        //acc1.initData("Aelita", "12345");
        acc1.deposit(1000);
    }
}
