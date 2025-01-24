package org.example.AccessModifiers;

import org.example.IntroToOOPs.BankAccount;

public class Client {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

//        bankAccount.balance = 0.0; // can't use private
//        bankAccount.ownerName = "Akash"; // public
//        bankAccount.age = 10; // default

        bankAccount.deposit(100.0);
    }
}
