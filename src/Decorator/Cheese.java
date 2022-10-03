package Decorator;

public class Cheese implements PizzaConstituents{

    private PizzaConstituents pizzaConstituents;

    public Cheese(PizzaConstituents pizzaConstituents)
    {
        this.pizzaConstituents = pizzaConstituents;
    }

    @Override
    public int getCost() {
        return pizzaConstituents.getCost() + 80;
    }

    @Override
    public String getDescription() {
        return pizzaConstituents.getDescription() + " + Cheese";
    }
}
