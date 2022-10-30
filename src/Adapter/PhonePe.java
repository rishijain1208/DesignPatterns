package Adapter;

public class PhonePe {

    private BankAPIAdapter bankAPIAdapter;

    public PhonePe(BankAPIAdapter bankAPIAdapter)
    {
        this.bankAPIAdapter = bankAPIAdapter;
    }

    double doSomething()
    {
        double currBalance = bankAPIAdapter.getBalance("acc");
        return currBalance*2;
    }
}
