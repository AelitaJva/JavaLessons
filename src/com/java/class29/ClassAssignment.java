package com.java.class29;


// grandparent class
class BankAccount {
    String accNum;
    double balance;

    BankAccount(String accNum, double balance) {
        this.accNum = accNum;
        this.balance = balance;
    }

    void deposit(int amount) {
        balance += amount;
    }
}

// parent class
class Withdraw extends BankAccount {

    Withdraw(String accNum, double balance) {
        super(accNum, balance);
    }

    void withdraw1 (int amount) {
        balance-=amount;
    }
}

// child class
class Loan extends BankAccount {

    Loan (String accNum, double balance) {
        super(accNum, balance);
    }

    void loan1 (double amount) {
        balance+=amount;
    }


}


public class ClassAssignment {
    public static void main(String[] args) {
        BankAccount c1 = new BankAccount("12344", 5000.0);
        BankAccount c2 = new BankAccount("55678", 1200.0);

        // grandparent class's object
        c1.deposit(2500);
        System.out.println("cl1 balance after deposit: " + c2.balance);

        // parent  class's object
        Withdraw cl3 = new Withdraw("67894", 6000);
        cl3.withdraw1(600);
        System.out.println("cl3 balance after withdrawing: " + cl3.balance);
        cl3.deposit(400);
        System.out.println("c3 balance after deposit: " + cl3.balance);


        // child class's object
        Loan cl5 = new Loan("678334", 0);
        cl5.loan1(78000.89);
        System.out.println(cl5.balance);
    }
}
