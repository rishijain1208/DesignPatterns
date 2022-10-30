package Strategy;

public class PathCalculatorFactory {

    public static IPathCalculatorStrategy getPathCalculatorStrategyByMode(String mode)
    {
        if(mode=="Bike")
        {
            return new BikePathCalculatorStrategy();
        }
        else if(mode=="Car")
        {
            return new CarPathCalculatorStrategy();
        }
        else if(mode=="Walk")
        {
            return new WalkPathCalculatorStrategy();
        }
        return null;
    }
}
