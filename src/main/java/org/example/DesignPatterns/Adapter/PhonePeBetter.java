package org.example.DesignPatterns.Adapter;

import org.example.DesignPatterns.Adapter.Library.HDFCBalanceRequest;
import org.example.DesignPatterns.Adapter.Library.HDFCBalanceResponse;
import org.example.DesignPatterns.Adapter.Library.HDFCBank;

public class PhonePeBetter {
    String phoneNo;
    BankAPI bankAPI = new YesBankAdapter();
    LoanEligibilityBetter eligibility = new LoanEligibilityBetter();

    BalanceResponse getBalance(){
        BalanceRequest balanceRequest = new BalanceRequest();
        balanceRequest.setPhoneNo(phoneNo);
        BalanceResponse response = bankAPI.balance(balanceRequest); // Not Actual SDK call -> calling our adapter
        return response;
    }
    void transfer(String ToPhoneNo, Integer amount){

    }

    boolean checkLoanEligibility(){
        return eligibility.checkLoanEligibility(bankAPI);
    }

}
