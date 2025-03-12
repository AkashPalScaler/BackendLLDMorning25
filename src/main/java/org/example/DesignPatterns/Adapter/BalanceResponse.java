package org.example.DesignPatterns.Adapter;

public class BalanceResponse {
    Integer balance;
    boolean belowMin;

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public boolean isBelowMin() {
        return belowMin;
    }

    public void setBelowMin(boolean belowMin) {
        this.belowMin = belowMin;
    }
}
