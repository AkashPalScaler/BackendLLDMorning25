package org.example.DesignPatterns.Adapter;

import org.example.DesignPatterns.Adapter.Library.HDFCBalanceRequest;
import org.example.DesignPatterns.Adapter.Library.HDFCBalanceResponse;
import org.example.DesignPatterns.Adapter.Library.HDFCBank;

public class HDFCBankAdapter implements BankAPI {
    HDFCBank hb = new HDFCBank();

    @Override
    public BalanceResponse balance(BalanceRequest request) {
        //To format to the correct request
        HDFCBalanceRequest HDFCrequest = new HDFCBalanceRequest();
        String phoneNo = request.getPhoneNo();
        String userId = phoneNo;//fetchUserIdFromNumber(phoneNo);
        HDFCrequest.setUserID(userId);

        HDFCBalanceResponse response = hb.fetchBalance(HDFCrequest);

        //Convert HDFC output to our required output
        BalanceResponse phonePeResponse = new BalanceResponse();

        phonePeResponse.setBelowMin(response.isBelowMin());
        phonePeResponse.setBalance(response.getAmount());
        return phonePeResponse;
    }
}
