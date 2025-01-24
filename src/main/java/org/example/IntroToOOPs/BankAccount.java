package org.example.IntroToOOPs;


import java.util.ArrayList;

public class BankAccount {
    private String ownerName;
    private Double balance;//Default
    private ArrayList<String> transactionLog;

    public BankAccount(){
        ownerName = "temp_name";
        balance = 0.0;
        transactionLog = new ArrayList<>();
    }

    public BankAccount(String ownerName, Double balance){
        this.ownerName = ownerName;
        this.balance = balance;
        transactionLog = new ArrayList<>();
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void deposit(Double amount){
        if(amount >= 0){
            balance += amount;
            transactionLog.add("Deposited "+ amount);
        }else{
            System.out.println("Amount can't be negative");
        }
    }

    public void withdraw(Double amount){
        if(amount > 0 && balance >= amount){
            balance -= amount;
            transactionLog.add("Withdrew "+ amount);
        }else{
            System.out.println("Can't withdraw, not enough balance");
        }
    }

    public void printTransactionLogs(){
        for(String log : transactionLog){
            System.out.println(log);
        }
    }
}
