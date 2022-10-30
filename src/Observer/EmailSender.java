package Observer;

public class EmailSender implements ISubscriber{

    public EmailSender()
    {
        Flipkart.getInstance().registerSubscriber(this);

    }
    @Override
    public void announce() {
        sendEmail();
    }

    public void sendEmail()
    {
        System.out.println("Email Sending..");
    }
}
