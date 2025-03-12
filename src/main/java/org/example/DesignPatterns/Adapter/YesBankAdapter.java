package org.example.DesignPatterns.Adapter;

import org.example.DesignPatterns.Adapter.Library.YesBank;
import org.example.DesignPatterns.Adapter.Library.YesBankBalanceRequest;
import org.example.DesignPatterns.Adapter.Library.YesBankBalanceResponse;

public class YesBankAdapter implements BankAPI{
    YesBank yb = new YesBank();
    @Override
    public BalanceResponse balance(BalanceRequest request) {
        // Convert request to Yesbankrequest
        String accountNo = request.getPhoneNo(); //Some logic to fetch accnt from phoneNo
        YesBankBalanceRequest balanceRequest = new YesBankBalanceRequest(accountNo);

        YesBankBalanceResponse response = yb.balance(balanceRequest);

        //Convert yesbankresponse to phone response
        BalanceResponse balanceResponse = new BalanceResponse();
        balanceResponse.setBalance(response.getValue());
        balanceResponse.setBelowMin(response.isMinBalReached());

        return balanceResponse;
    }
}
