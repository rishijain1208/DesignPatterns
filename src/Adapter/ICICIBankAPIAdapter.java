package Adapter;

import Adapter.ICICIBankAPI.ICICIBankAPI;

public class ICICIBankAPIAdapter implements BankAPIAdapter{

    private ICICIBankAPI iciciBankAPI = new ICICIBankAPI();

    @Override
    public boolean sendMoney(String fromAcc, String toAcc, double account) {
        //iciciBankAPI.getBalance();
        return false;
    }

    @Override
    public double getBalance(String accountNumber) {
        return 0;
    }
}
