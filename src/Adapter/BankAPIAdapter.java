package Adapter;

public interface BankAPIAdapter {

    double getBalance(String accountNumber);

    boolean sendMoney(String fromAcc,String toAcc,double account);
}
