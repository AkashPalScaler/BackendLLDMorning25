package org.example.DesignPatterns.Adapter;

import org.example.DesignPatterns.Adapter.Library.HDFCBalanceRequest;
import org.example.DesignPatterns.Adapter.Library.HDFCBalanceResponse;
import org.example.DesignPatterns.Adapter.Library.HDFCBank;

public class LoanEligibilityBetter {
    Integer creditScore;
    Integer minAccntBalForLoan;

    boolean checkLoanEligibility(BankAPI api){
        BalanceRequest balanceRequest = new BalanceRequest();

        BalanceResponse response = api.balance(balanceRequest);
        if(response.getBalance() > minAccntBalForLoan && creditScore > 500){
            return true;
        }
        return false;
    }
}
