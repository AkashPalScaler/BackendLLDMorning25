package org.example.PhonePeExample;

public class PhonePe {
//    Wrong way
    //Before BAN
//    YesBankAPI yb = new YesBankAPI();
//    int getBalance(String accnt){
//        return yb.getBalance(accnt);
//    }
//
//    void transfer(String accntFrm, String accntTo){
//        yb.transferMoney(accntFrm, accntTo);
//    }

    //After YES BANK API BAN

//    ICICIBankAPI icb = new ICICIBankAPI();
//    int getBalance(String accnt){
//        String userId = accnt;
//        return icb.fetchBalance(userId);
//    }
//    void transfer(String accntFrm, String accntTo){
//        icb.sendMoney(accntFrm, accntTo);
//    }


    // Right way ("Code to interfaces not to classes")
    //Before BAN -> After BAN
    // Input string "YesBank"
    BankAPI bankapi = new YesBankAPI();
    int getBalance(String accnt){
        bankapi.checkBalance(accnt);
        return 0;
    }
    void transfer(String accntFrm, String accntTo){
        bankapi.transfer(accntFrm, accntTo);
    }

}
