package org.example.PhonePeExample;

public interface BankAPI {
    int checkBalance(String accntNo);
    void transfer(String accntFrom, String accntTo);
}
