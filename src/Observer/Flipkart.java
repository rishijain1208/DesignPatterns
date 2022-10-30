package Observer;

import java.util.ArrayList;
import java.util.List;

public class Flipkart {

    private static Flipkart instance;

    public static Flipkart getInstance()
    {
        if(instance==null)
        {
            instance = new Flipkart();
        }
        return instance;
    }
    public List<ISubscriber> list = new ArrayList<>();

    public void registerSubscriber(ISubscriber subscriber)
    {
        list.add(subscriber);
    };

    public void unregisterSubscriber(ISubscriber subscriber)
    {
        list.remove(subscriber);
    };

    public void orderPlaced()
    {
        for (ISubscriber subscriber:list)
        {
            subscriber.announce();
        }
    }
}
