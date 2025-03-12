package org.example.DesignPatterns.Adapter;

public interface BankAPI {
    BalanceResponse balance(BalanceRequest request);
}
