package org.example.DesignPatterns.Adapter.Library;

//HDFC SDK
public class HDFCBank {
    public HDFCBalanceResponse fetchBalance(HDFCBalanceRequest hdfcRequest){
            // Api call takes place
            HDFCBalanceResponse hdfcBalanceResponse = new HDFCBalanceResponse();
            return hdfcBalanceResponse;
    }
}
