package org.example.PhonePeExample;

public class YesBankAPI implements BankAPI{
    int getBalance(String accnt){
        //Connecting to YesBank
        System.out.println("GetBalance of Yes BANK");
        return 0;
    }
    void transferMoney(String accntFrom, String accntTo){
        System.out.println("Transfering money through Yesbank");
    }

    @Override
    public int checkBalance(String accntNo) {
        return 0;
    }

    @Override
    public void transfer(String accntFrom, String accntTo) {

    }
}
