package Strategy;

public class GoogleMaps {

    public void FindPath(String From, String To, String Mode) {

        IPathCalculatorStrategy obj = PathCalculatorFactory.getPathCalculatorStrategyByMode(Mode);
        obj.FindPath(From,To);
    }
}