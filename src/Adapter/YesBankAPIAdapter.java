package Adapter;

import Adapter.YesBankAPI.YesBankAPI;

public class YesBankAPIAdapter implements BankAPIAdapter{

    private YesBankAPI yesBankAPI = new YesBankAPI();

    @Override
    public boolean sendMoney(String fromAcc, String toAcc, double account) {
        return false;
    }

    @Override
    public double getBalance(String accountNumber) {
        return 0;
    }
}
