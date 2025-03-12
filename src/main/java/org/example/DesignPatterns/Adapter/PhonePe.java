package org.example.DesignPatterns.Adapter;

import org.example.DesignPatterns.Adapter.Library.HDFCBalanceRequest;
import org.example.DesignPatterns.Adapter.Library.HDFCBalanceResponse;
import org.example.DesignPatterns.Adapter.Library.HDFCBank;

public class PhonePe {
    String phoneNo;
    HDFCBank hb = new HDFCBank();
    LoanEligibility eligibility = new LoanEligibility();

    BalanceResponse getBalance(){

        //To format to the correct request
        HDFCBalanceRequest request = new HDFCBalanceRequest();
        String userId = "12";//fetchUserIdFromNumber(phoneNo);
        request.setUserID(userId);

        HDFCBalanceResponse response = hb.fetchBalance(request); // Actual SDK call

        //Convert HDFC output to our required output
        BalanceResponse phonePeResponse = new BalanceResponse();

        phonePeResponse.setBelowMin(response.isBelowMin());
        phonePeResponse.setBalance(response.getAmount());
        return phonePeResponse;
    }
    void transfer(String ToPhoneNo, Integer amount){

    }

    boolean checkLoanEligibility(){
        return eligibility.checkLoanEligibility(hb);
    }

}
