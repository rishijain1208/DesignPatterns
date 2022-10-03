package Decorator;

public class Olive implements  PizzaConstituents{
    private PizzaConstituents pizzaConstituents;

    public Olive(PizzaConstituents pizzaConstituents)
    {
        this.pizzaConstituents = pizzaConstituents;
    }

    @Override
    public int getCost() {
        return pizzaConstituents.getCost() + 20;
    }

    @Override
    public String getDescription() {
        return pizzaConstituents.getDescription() + " + Olive";
    }
}
