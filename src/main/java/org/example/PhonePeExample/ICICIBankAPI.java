package org.example.PhonePeExample;

public class ICICIBankAPI implements BankAPI{
    int fetchBalance(String userID){
        System.out.println("GetBalance of ICICI BANK");
        return 0;
    }
    void sendMoney(String accntTo, String accntFrom){
        System.out.println("Trasfering money through ICICI");
    }


    // Part of solution
    @Override
    public int checkBalance(String accntNo) {
        String userId = accntNo; //transform
        //Userid with actual bank API http call to actual bank server
        return 0;
    }

    @Override
    public void transfer(String accntFrom, String accntTo) {

    }
}
