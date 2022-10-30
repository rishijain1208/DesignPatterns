package Observer;

public class InvoiceGenerator implements ISubscriber{

    public InvoiceGenerator()
    {
        Flipkart.getInstance().registerSubscriber(this);
    }
    @Override
    public void announce() {
        System.out.println("Invoice Generator");
    }
}
