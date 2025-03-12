package org.example.DesignPatterns.Adapter;

import org.example.DesignPatterns.Adapter.Library.HDFCBalanceRequest;
import org.example.DesignPatterns.Adapter.Library.HDFCBalanceResponse;
import org.example.DesignPatterns.Adapter.Library.HDFCBank;

public class LoanEligibility {
    Integer creditScore;
    Integer minAccntBalForLoan;

    boolean checkLoanEligibility(HDFCBank api){
        HDFCBalanceRequest request = new HDFCBalanceRequest();
        String userId = "12";//fetchUserIdFromNumber(phoneNo);
        request.setUserID(userId);

        HDFCBalanceResponse response = api.fetchBalance(request);
        if(response.getAmount() > minAccntBalForLoan && creditScore > 500){
            return true;
        }
        return false;
    }
}
