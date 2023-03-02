package com.java.class33;

class ChaseBank {
    public int balance;

    public void withdraw (int amount) {
        balance-=amount;
    }

    public void deposit (int amount) {
        balance+=amount;
    }
}

public class PurposeAccessModifier {
    public static void main(String[] args) {
        ChaseBank cb = new ChaseBank();
        cb.deposit(5000);
        cb.balance = 8000;
    }
}
